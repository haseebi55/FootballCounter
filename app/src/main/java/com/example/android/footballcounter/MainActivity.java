package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int FoulTeamA = 0;
    int scoreTeamB = 0;
    int FoulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_aFoul_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addFoulForTeamA(View v) {
        FoulTeamA++ ;
        displayFoulForTeamA(FoulTeamA);
    }

    public void addGoalForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_bFoul_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addFoulForTeamB(View v) {
        FoulTeamB++;
        displayFoulForTeamB(FoulTeamB);
    }

    public void addGoalForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View v){
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
    }

}
