package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int FoulA =0;
    int scoreTeamB = 0;
    int FoulTeamA = 0 ;
    int FoulTeamB = 0 ;
    int CardTeamA = 0 ;
    int CardTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayFoulForTeamA(0);
        displayCardForTeamA(0);
        displayForTeamB(0);
        displayFoulForTeamB(0);
        displayCardForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given Fouls for Team A.
     */
    public void displayFoulForTeamA(int FoulA) {
        TextView FoulAView = (TextView) findViewById(R.id.team_a_foul_score);
        FoulAView.setText(String.valueOf(FoulA));
    }

    public void addFoulForTeamA(View v) {
        FoulTeamA = FoulTeamA + 1;
        displayForTeamA(FoulTeamA);
    }
    /**
     * Displays the given Cards for Team A.
     */
    public void displayCardForTeamA(int CardA) {
        TextView CardAView = (TextView) findViewById(R.id.team_a_card_score);
        CardAView.setText(String.valueOf(CardA));
    }
    public void addCardForTeamA(View v) {
        CardTeamA = CardTeamA + 1;
        displayForTeamA(CardTeamA);
    }


    /**
     * Displays the given Foul for Team A.
     */
    public void displayFoulForTeamB(int FoulA) {
        TextView FoulAView = (TextView) findViewById(R.id.team_a_foul_score);
        FoulAView.setText(String.valueOf(FoulA));
    }
    public void addFoulForTeamB(View v) {
        FoulTeamB = FoulTeamB + 1;
        displayForTeamB(FoulTeamB);
    }
    /**
     * Displays the given Cards for Team B.
     */
    public void displayCardForTeamB(int FoulB) {
        TextView FoulBView = (TextView) findViewById(R.id.team_b_card_score);
        FoulBView.setText(String.valueOf(FoulB));
    }

    public void addCardForTeamB(View v) {
        CardTeamB = CardTeamB + 1;
        displayForTeamB(CardTeamB);
    }
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        FoulTeamA = 0 ;
        FoulTeamB = 0 ;
        CardTeamA = 0 ;
        CardTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayFoulForTeamA(FoulTeamA);
        displayCardForTeamA(CardTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamB(FoulTeamB);
        displayCardForTeamB(CardTeamB);

    }

}