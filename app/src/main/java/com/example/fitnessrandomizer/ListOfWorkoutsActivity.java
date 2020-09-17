package com.example.fitnessrandomizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListOfWorkoutsActivity extends AppCompatActivity {

    private RecyclerView workoutRecView;
    private WorkoutRecViewAdapter adapter;
    private ArrayList<Workout> workouts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_workouts);

        //TODO: Comment out function and replace with DatabaseHelper
        setWorkouts();

        adapter = new WorkoutRecViewAdapter(this, "allWorkouts");
        workoutRecView = findViewById(R.id.workoutRecView);

        workoutRecView.setAdapter(adapter);
        workoutRecView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setWorkouts(workouts);

    }

    private void setWorkouts() {
        workouts.add(new Workout("Standing", "Whole Body", 10, 300));
        workouts.add(new Workout("Standing Harder", "Whole Body", 20, 600));
        workouts.add(new Workout("T-Pose", "Brain", 100, 3000));
    }
}