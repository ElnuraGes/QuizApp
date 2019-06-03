package com.elnura.quizapp.ui.quiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.elnura.quizapp.R;

public class QuizActivity extends AppCompatActivity {

    public static void start(Context context){
        context.startActivity(new Intent(context, QuizActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}
