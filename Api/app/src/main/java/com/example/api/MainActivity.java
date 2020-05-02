package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView idtv;
    TextView idtvinfo;
    Button nxtbutton;
    private RequestQueue queue;

    private static final String URL ="https://cat-fact.herokuapp.com/Facts"; //it's final and private so nothing can modify the url

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtv =  findViewById(R.id.idtv);
        idtvinfo = findViewById(R.id.idtvinfo);
        nxtbutton = findViewById(R.id.nxtbtn);
    }

    public void nextData(View view) {
        queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject obj = new JSONObject(response);
                    JSONArray info = obj.getJSONArray("all");
                    String catinfo = info.getJSONObject(0).getString("text");
                    String catid = info.getJSONObject(0).getString("_id");
                    idtv.setText(catid);
                    idtvinfo.setText(catinfo);

                }
                catch(JSONException e){

                }



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);
    }
}
