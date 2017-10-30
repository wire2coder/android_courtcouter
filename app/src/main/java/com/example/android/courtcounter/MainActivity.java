package com.example.android.courtcounter;

import android.bluetooth.le.ScanRecord;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global variables
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button3 = (Button) findViewById(R.id.button_three_points);
//        Button button2 = (Button) findViewById(R.id.button_two_points);
//        Button button_free_throw = (Button) findViewById(R.id.button_free_throw);

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

} // class
