package com.shaurya.Workout.Tracker.Workout.entity.dtos;

import lombok.Data;

@Data
public class WorkoutDtos {
    private Integer workoutId;
    private String workoutType;
    private String workoutName;
    private Integer workoutDuration;
    private Integer userId;
}
