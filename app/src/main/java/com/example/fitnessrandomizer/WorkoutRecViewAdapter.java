package com.example.fitnessrandomizer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class WorkoutRecViewAdapter extends RecyclerView.Adapter<WorkoutRecViewAdapter.ViewHolder> {

    private static final String TAG = "WorkoutRecViewAdapter";

    private ArrayList<Workout> workouts = new ArrayList<>();
    Context mContext;
    private String parentActivity;

    public WorkoutRecViewAdapter(Context mContext, String parentActivity) {
        this.mContext = mContext;
        this.parentActivity = parentActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_workouts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final WorkoutRecViewAdapter.ViewHolder holder, final int position) {
        //Set View contents (e.g set Workout Name TextView to hold the given name of the workout)
        Log.d(TAG, "onBindViewHolder: Built");
        holder.txtWorkoutName.setText(workouts.get(position).getName());
        holder.imgWorkout.setImageResource(workouts.get(position).getImgRes());
        holder.txtWorkoutMuscle.setText(workouts.get(position).getMuscle());
        /* Would look up workout image if it was online
        Glide.with(mContext)
        .asBitmap()
        .load(workouts.get(position).getImgUrl())
        .into(holder.imgWorkout);
        */
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WorkoutActivity.class);
                intent.putExtra("workoutName", workouts.get(position).getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return workouts.size(); }

    public void setWorkouts(ArrayList<Workout> workouts){
        this.workouts = workouts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView parent;
        ImageView imgNavArrow, imgWorkout;
        TextView txtWorkoutName, txtWorkoutMuscle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgNavArrow = itemView.findViewById(R.id.imgNavArrow);
            imgWorkout = itemView.findViewById(R.id.imgWorkoutVector);
            txtWorkoutName = itemView.findViewById(R.id.txtWorkoutName);
            txtWorkoutMuscle = itemView.findViewById(R.id.txtMuscle);
        }
    }
}
