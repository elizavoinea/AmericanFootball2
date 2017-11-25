package com.example.android.americanfootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scoreA(View View ){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void scoreAdoi(View View){

        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void scoreAtrei(View View){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void scoreAsase(View View ){
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
    }
    public void scoreB(View View){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void scoreBdoi(View View ){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void scoreBtrei(View View){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    public void scoreBsase(View View){
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB (int scoreB){
        TextView  scoreBView = (TextView)  findViewById(R.id.team_b_score);
        scoreBView.setText(String.valueOf(scoreB));
    }
    /**
     * Reset score
     */
     public void reset(View view){
         scoreA = 0;
         scoreB = 0;
         TextView  scoreBView = (TextView)  findViewById(R.id.team_b_score);
         TextView scoreView = (TextView) findViewById(R.id.team_a_score);
         scoreView.setText(String.valueOf(scoreA));
         scoreBView.setText(String.valueOf(scoreB));
    }
    /**
     * Displays the winner
     */
    public void displayTheWinner (View View)
    {
         TextView winner = (TextView) findViewById(R.id.winner);
         if (scoreA > scoreB)
                winner.setText("Team A");
         if (scoreA < scoreB)
                winner.setText("Team B");
         if (scoreA == scoreB)
                winner.setText("Equality");
    }

}
