package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0, scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(1);
        displayForTeamB(1);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increments the given score by 3.
     */
    public void addThreeForTeam(View v) {
        if(v==findViewById(R.id.a_3_points)){
            scoreTeamA+=3;
            displayForTeamA(scoreTeamA);
        }
        else if(v==findViewById(R.id.b_3_points)){
            scoreTeamB+=3;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Increments the given score by 2.
     */
    public void addTwoForTeam(View v) {
        if(v==findViewById(R.id.a_2_points)){
            scoreTeamA+=2;
            displayForTeamA(scoreTeamA);
        }
        else if(v==findViewById(R.id.b_2_points)){
            scoreTeamB+=2;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Increments the given score by 1.
     */
    public void addOneForTeam(View v) {
        if(v==findViewById(R.id.a_1_points)){
            scoreTeamA+=1;
            displayForTeamA(scoreTeamA);
        }
        else if(v==findViewById(R.id.b_1_points)){
            scoreTeamB+=1;
            displayForTeamB(scoreTeamB);
        }
    }

    public void reset_action(View v){
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }
}
