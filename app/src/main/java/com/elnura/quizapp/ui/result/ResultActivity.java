package com.elnura.quizapp.ui.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.elnura.quizapp.R;

public class ResultActivity extends AppCompatActivity {

    public static void start(Context context){
        context.startActivity(new Intent(context, ResultActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
}
