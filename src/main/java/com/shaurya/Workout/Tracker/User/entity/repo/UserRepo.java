package com.shaurya.Workout.Tracker.User.entity.repo;

import com.shaurya.Workout.Tracker.User.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
