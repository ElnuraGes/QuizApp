package com.elnura.quizapp.ui.quiz.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {
    @NonNull
    @Override
    public QuizAdapter.QuizViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder quizViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
     class QuizViewHolder extends RecyclerView.ViewHolder{

         public QuizViewHolder(@NonNull View itemView) {
             super(itemView);
         }
     }
}
