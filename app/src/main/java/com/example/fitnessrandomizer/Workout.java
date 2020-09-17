package com.example.fitnessrandomizer;

import android.content.res.Resources;

public class Workout {
    String name;
    String muscle;
    int reps;
    int timeSeconds;
    String imgUrl;
    int res = R.drawable.ic_baseline_accessibility_24;

    public Workout(String name, String muscle, int reps, int time) {
        this.name = name;
        this.muscle = muscle;
        this.reps = reps;
        this.timeSeconds = time;
        //this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getTimeSeconds() {
        return timeSeconds;
    }

    public void setTimeSeconds(int time) {
        this.timeSeconds = time;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getImgRes(){
        return this.res;
    }

    public void setImgRes(int res){
        this.res = res;
    }
}
