package com.example.fitnessrandomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        Intent intent = getIntent();
        if (null != intent) {
            int workoutId = intent.getIntExtra("workoutName", -1);
            if (workoutId != -1){
                Workout incomingWorkout;
            }
        }
    }
}