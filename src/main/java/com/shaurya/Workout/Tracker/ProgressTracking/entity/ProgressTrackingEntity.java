package com.shaurya.Workout.Tracker.ProgressTracking.entity;

import com.shaurya.Workout.Tracker.User.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

/*
* Progress Tracking
ProgressID (primary key)
WorkoutID (foreign key referencing the Workouts table)
Date
Weight
BodyFatPercentage
Notes
* */
//TODO: connect the foreign key of workout id with the progress table
@Entity(name = "Progress Track")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class ProgressTrackingEntity {
    @Id
    @SequenceGenerator(
            name = "progress_sequence",
            sequenceName = "progress_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "progress_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private int progressId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;
}
