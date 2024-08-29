package com.shaurya.Workout.Tracker.Workout.entity.repo;

import com.shaurya.Workout.Tracker.Workout.entity.WorkoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<WorkoutEntity, Integer> {
}
