package com.shaurya.Workout.Tracker.ProgressTracking.entity;

import com.shaurya.Workout.Tracker.User.entity.UserEntity;
import com.shaurya.Workout.Tracker.Workout.entity.WorkoutEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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
    @JoinColumn(name = "workout_id", referencedColumnName = "id")
    private WorkoutEntity workoutEntity;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private double weight;

    @Column(name = "body_fat_percent", nullable = false)
    private double bodyFatPercentage;

    @Column(name = "notes", length = 500)
    private String notes;
}
