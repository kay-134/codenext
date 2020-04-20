package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<Categoryitem> artists = new ArrayList<>();

        artists.add(new Categoryitem("Rihanna", R.drawable.rihanna));
        artists.add(new Categoryitem("Kid Cudi", R.drawable.cudi));
        artists.add(new Categoryitem("Gunna", R.drawable.gunna));
        artists.add(new Categoryitem("YoungBoy", R.drawable.youngboy));
        artists.add(new Categoryitem("Billie Eilish", R.drawable.unnamed));
        artists.add(new Categoryitem("H.E.R", R.drawable.her));
        artists.add(new Categoryitem("Billie Eilish", R.drawable.unnamed));


        ListView listview = findViewById(R.id.artist_listview);
        CategoryAdapter artistAdapter = new CategoryAdapter(this, artists);
        listview.setAdapter(artistAdapter);

    }
}
