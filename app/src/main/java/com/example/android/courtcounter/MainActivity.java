package com.example.android.courtcounter;

import android.bluetooth.le.ScanRecord;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global variables
    int scoreTeamA, scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button3 = (Button) findViewById(R.id.button_three_points);
//        Button button2 = (Button) findViewById(R.id.button_two_points);
//        Button button_free_throw = (Button) findViewById(R.id.button_free_throw);

    }

    public void resetScores(View v) {
        scoreTeamA =0;
        scoreTeamB = 0;

        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

    /* Display the given score for Team A */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        // convert the integer value into string value
        scoreView.setText(String.valueOf(score));
    }

} // class
