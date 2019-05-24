package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int lastScoreTeamA = 0;
    int lastScoreTeamB = 0;

    /**
     * For team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamA(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * For team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamB(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsTeamB(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowTeamB(View v) {
        lastScoreTeamA = scoreTeamA;
        lastScoreTeamB = scoreTeamB;
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void undo(View v) {
        scoreTeamA = lastScoreTeamA;
        scoreTeamB = lastScoreTeamB;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
