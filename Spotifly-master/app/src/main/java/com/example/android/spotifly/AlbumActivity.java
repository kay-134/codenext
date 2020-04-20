package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<Categoryitem> albums = new ArrayList<>();

        albums.add(new Categoryitem("Loud", R.drawable.loud));
        albums.add(new Categoryitem("Never Broke Again", R.drawable._never_broke_again));
        albums.add(new Categoryitem("Drip or Drown 2", R.drawable._drip_or_drown2));
        albums.add(new Categoryitem("Man On The Moon", R.drawable.man_on_the_moon));

        ListView listview2 = findViewById(R.id.album_listview);
        CategoryAdapter albumAdapter = new CategoryAdapter(this, albums);
        listview2.setAdapter(albumAdapter);


    }
}
