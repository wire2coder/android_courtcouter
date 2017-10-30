package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button) findViewById(R.id.button_three_points);
        Button button2 = (Button) findViewById(R.id.button_two_points);
        Button button_free_throw = (Button) findViewById(R.id.button_free_throw);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayForTeamA(3);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayForTeamA(2);
            }
        });

        button_free_throw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayForTeamA(1);
            }
        });

    }

    /* Display the given score for Team A */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

} // class
