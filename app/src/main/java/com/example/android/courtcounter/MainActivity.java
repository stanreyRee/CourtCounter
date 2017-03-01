package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetScores();
    }

    public void resetAll(View view) {
        resetScores();
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(this.teamAScore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(this.teamBScore));
    }

    public void addThreeForTeamA(View view) {
        this.addPointsForTeamA(3);
        this.displayForTeamA();
    }

    public void addTwoForTeamA(View view) {
        this.addPointsForTeamA(2);
        this.displayForTeamA();
    }

    public void addOneForTeamA(View view) {
        this.addPointsForTeamA(1);
        this.displayForTeamA();
    }


    public void addThreeForTeamB(View view) {
        this.addPointsForTeamB(3);
        this.displayForTeamB();
    }

    public void addTwoForTeamB(View view) {
        this.addPointsForTeamB(2);
        this.displayForTeamB();
    }

    public void addOneForTeamB(View view) {
        this.addPointsForTeamB(1);
        this.displayForTeamB();
    }

    /**
     * Adds the given score to Team A's total score.
     */
    private void addPointsForTeamA(int pts) {
        this.teamAScore += pts;
    }

    /**
     * Adds the given score to Team B's total score.
     */
    private void addPointsForTeamB(int pts) {
        this.teamBScore += pts;
    }

    /**
     * Reset both team's score to 0, and display their scores.
     */
    private void resetScores() {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
