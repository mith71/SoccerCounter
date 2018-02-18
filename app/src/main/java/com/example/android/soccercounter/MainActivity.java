package com.example.android.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int goalsTeamA;
    private int goalsTeamB;
    private int cornersTeamA;
    private int cornersTeamB;
    private int foulsTeamA;
    private int foulsTeamB;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("goalsTeamA", goalsTeamA);
        outState.putInt("goalsTeamB", goalsTeamB);
        outState.putInt("cornersTeamA", cornersTeamA);
        outState.putInt("cornersTeamB", cornersTeamB);
        outState.putInt("foulsTeamA", foulsTeamA);
        outState.putInt("foulsTeamB", foulsTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalsTeamA = savedInstanceState.getInt("goalsTeamA");
        goalsTeamB = savedInstanceState.getInt("goalsTeamB");
        cornersTeamA = savedInstanceState.getInt("cornersTeamA");
        cornersTeamB = savedInstanceState.getInt("cornersTeamB");
        foulsTeamA = savedInstanceState.getInt("foulsTeamA");
        foulsTeamB = savedInstanceState.getInt("foulsTeamB");

        displayGoalsForTeamA(goalsTeamA);
        displayCornersForTeamA(cornersTeamA);
        displayFoulsForTeamA(foulsTeamA);

        displayGoalsForTeamB(goalsTeamB);
        displayCornersForTeamB(cornersTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A.
     */
    public void addGoalForTeamA(View v){
        goalsTeamA++;
        displayGoalsForTeamA(goalsTeamA);
    }
    public void addCornerForTeamA(View v){
        cornersTeamA++;
        displayCornersForTeamA(cornersTeamA);
    }
    public void addFoulForTeamA(View v){
        foulsTeamA++;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Increase the score for Team B.
     */
    public void addGoalForTeamB(View v){
        goalsTeamB++;
        displayGoalsForTeamB(goalsTeamB);
    }
    public void addCornerForTeamB(View v){
        cornersTeamB++;
        displayCornersForTeamB(cornersTeamB);
    }
    public void addFoulForTeamB(View v){
        foulsTeamB++;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Reset the score for Team A and Team B.
     */
    public void resetScore(View v){
        goalsTeamA = 0;
        goalsTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;

        displayGoalsForTeamA(goalsTeamA);
        displayCornersForTeamA(cornersTeamA);
        displayFoulsForTeamA(foulsTeamA);

        displayGoalsForTeamB(goalsTeamB);
        displayCornersForTeamB(cornersTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given count for Team A.
     */
    public void displayGoalsForTeamA(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(count));
    }
    public void displayCornersForTeamA(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(count));
    }
    public void displayFoulsForTeamA(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(count));
    }

    /**
     * Displays the given count for Team B.
     */
    public void displayGoalsForTeamB(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(count));
    }
    public void displayCornersForTeamB(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(count));
    }
    public void displayFoulsForTeamB(int count) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(count));
    }
}
