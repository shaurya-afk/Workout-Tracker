package com.shaurya.Workout.Tracker.Workout.entity.service;

import com.shaurya.Workout.Tracker.User.entity.UserEntity;
import com.shaurya.Workout.Tracker.User.entity.repo.UserRepo;
import com.shaurya.Workout.Tracker.Workout.entity.WorkoutEntity;
import com.shaurya.Workout.Tracker.Workout.entity.dtos.WorkoutDtos;
import com.shaurya.Workout.Tracker.Workout.entity.repo.WorkoutRepo;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkoutServices {
    @Autowired
    private WorkoutEntity workoutEntity;
    private WorkoutRepo workoutRepo;
    private UserRepo userRepo;

    public WorkoutEntity createWorkout(WorkoutDtos workout)
    {
        WorkoutEntity newWorkout = new WorkoutEntity();
        newWorkout.setWorkoutName(workout.getWorkoutName());
        newWorkout.setWorkoutType(workout.getWorkoutType());
        newWorkout.setWorkoutDuration(workout.getWorkoutDuration());

        Optional<UserEntity> userCheck = userRepo.findById(workout.getUserId());
        if(userCheck.isPresent())
        {
            newWorkout.setUserEntity(userCheck.get());
        }

        return workoutRepo.save(newWorkout);
    }

    public WorkoutEntity updateWorkout(WorkoutDtos workoutDtos)
    {
        Optional<WorkoutEntity> workoutOpt = workoutRepo.findById(workoutDtos.getWorkoutId());
        if(workoutOpt.isPresent()){
            WorkoutEntity existingWorkoutEntity = workoutOpt.get();

            existingWorkoutEntity.setWorkoutName(workoutEntity.getWorkoutName());
            existingWorkoutEntity.setWorkoutType(workoutEntity.getWorkoutType());
            existingWorkoutEntity.setWorkoutDuration(workoutDtos.getWorkoutDuration());

            Optional<UserEntity> user = userRepo.findById(workoutDtos.getUserId());
            if (user.isPresent())
            {
                existingWorkoutEntity.setUserEntity(user.get());
            }
            return workoutRepo.save(existingWorkoutEntity);
        }else {
            return null;
        }
    }
}
