package com.example.myquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Limbo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    public void openInfo(View view) {
        Intent intentToOpenInfo = new Intent(this, Info.class);
        startActivity(intentToOpenInfo);
    }

    public void openQuiz(View view) {
        Intent intentToOpenQuiz = new Intent(this, Quiz.class);
        startActivity(intentToOpenQuiz);
    }
}