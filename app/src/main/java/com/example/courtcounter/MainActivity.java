package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA=0,scoreTeamB=0;
    public void ResetButton(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA( scoreTeamA);
        displayForTeamB( scoreTeamB);
    }
    public void threepointerA(View view){
        scoreTeamA+=3;
        displayForTeamA( scoreTeamA);
    }
    public void twopointerA(View view){
        scoreTeamA+=2;
        displayForTeamA( scoreTeamA);
    }
    public void onepointerA(View view){
        scoreTeamA+=1;
        displayForTeamA( scoreTeamA);
    }
    public void threepointerB(View view){
        scoreTeamB+=3;
        displayForTeamB( scoreTeamB);
    }
    public void twopointerB(View view){
        scoreTeamB+=2;
        displayForTeamB( scoreTeamB);
    }
    public void onepointerB(View view){
        scoreTeamB+=1;
        displayForTeamB( scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
