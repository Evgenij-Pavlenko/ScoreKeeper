package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int lastScoreForTeamA = 0;
    int lastScoreForTeamB = 0;

    public void displayForTeamA(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForUndoA(int score){
        TextView undoA = findViewById(R.id.button_undo_a);
        undoA.setText(String.valueOf("undo (-" +score +")"));
    }

    public void displayForUndoB(int score){
        TextView undoB = findViewById(R.id.button_undo_b);
        undoB.setText(String.valueOf("undo (-" +score +")"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixForTeamA(View view) {
        scoreTeamA +=6;
        lastScoreForTeamA = 6;
        displayForTeamA(scoreTeamA);
        displayForUndoA(lastScoreForTeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA +=3;
        lastScoreForTeamA = 3;
        displayForTeamA(scoreTeamA);
        displayForUndoA(lastScoreForTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA +=2;
        lastScoreForTeamA = 2;
        displayForTeamA(scoreTeamA);
        displayForUndoA(lastScoreForTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA +=1;
        lastScoreForTeamA = 1;
        displayForTeamA(scoreTeamA);
        displayForUndoA(lastScoreForTeamA);
    }

    public void undoLastPointForTeamA(View view) {
        scoreTeamA -= lastScoreForTeamA;
        lastScoreForTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForUndoA(0);
    }

    public void addSixForTeamB(View view) {
        scoreTeamB +=6;
        lastScoreForTeamB = 6;
        displayForTeamB(scoreTeamB);
        displayForUndoB(lastScoreForTeamB);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB +=3;
        lastScoreForTeamB = 3;
        displayForTeamB(scoreTeamB);
        displayForUndoB(lastScoreForTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB +=2;
        lastScoreForTeamB = 2;
        displayForTeamB(scoreTeamB);
        displayForUndoB(lastScoreForTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB +=1;
        lastScoreForTeamB = 1;
        displayForTeamB(scoreTeamB);
        displayForUndoB(lastScoreForTeamB);
    }

    public void undoLastPointForTeamB(View view) {
        scoreTeamB -= lastScoreForTeamB;
        lastScoreForTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForUndoB(0);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
         scoreTeamB = 0;
         lastScoreForTeamA = 0;
         lastScoreForTeamB = 0;
         lastScoreForTeamA = 0;
         lastScoreForTeamB = 0;
         displayForTeamA(scoreTeamA);
         displayForTeamB(scoreTeamB);
        displayForUndoA(lastScoreForTeamA);
        displayForUndoB(lastScoreForTeamB);
    }
}
