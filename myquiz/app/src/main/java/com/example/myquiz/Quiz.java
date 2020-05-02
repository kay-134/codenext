package com.example.myquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {

    TextView questionTextView;
    ArrayList<Question> questions;
    int currentindex;
    Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realquiz);
        questionTextView = findViewById(R.id.questionTextView);
        questions = new ArrayList<>();
        addQuestions();
        currentindex = 0;
        displayQuestion(currentindex);
    }

    private void addQuestions(){
        questions.add(new Question("who is Kayley?",  //One question
                new String[]{"you", "bye", "a person"}, "A"));
        questions.add(new Question("who is Kayley?",  //One question
                new String[]{"you", "bye", "a person"}, "A"));


    }

    private void displayQuestion(int currentindex){
        questionTextView.setText(questions.get(0).getQuestion()//displaying the first question w/ possible answers
                +"\n\nA)" + questions.get(currentindex).getPossibleAnswers()[0]
                +"\n\nA)" + questions.get(currentindex).getPossibleAnswers()[1]
                +"\n\nA)" + questions.get(currentindex).getPossibleAnswers()[2]);
    }

    public void buttonAClicked(View view){
        currentQuestion = questions.get(currentindex);
        Toast message;
        if (currentQuestion.getAnswer()=="A"){
            message = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
            message.show();
        }
        else{
            message = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
            message.show();
        }

        if (currentindex==questions.size()-1){
            currentindex=0;
        }
        else {
            currentindex++;
        }

        displayQuestion(currentindex);

    }

    public void buttonBClicked(View view){
        currentQuestion = questions.get(currentindex);
        Toast message;
        if (currentQuestion.getAnswer()=="B"){
            message = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
            message.show();
        }
        else{
            message = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
            message.show();
        }

        if (currentindex==questions.size()-1){
            currentindex=0;
        }
        else {
            currentindex++;
        }

        displayQuestion(currentindex);
    }

    public void buttonCClicked(View view){
        currentQuestion = questions.get(currentindex);
        Toast message;
        if (currentQuestion.getAnswer()=="C"){
            message = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
            message.show();
        }
        else{
            message = Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
            message.show();
        }

        if (currentindex==questions.size()-1){
            currentindex=0;
        }
        else {
            currentindex++;
        }

        displayQuestion(currentindex);

    }
}
