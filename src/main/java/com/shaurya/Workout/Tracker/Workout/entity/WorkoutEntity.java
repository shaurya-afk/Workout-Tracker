package com.shaurya.Workout.Tracker.Workout.entity;

import com.shaurya.Workout.Tracker.User.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "WorkoutDetails")
@Data
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkoutEntity {
    @Id
    @SequenceGenerator(
            name = "workout_sequence",
            sequenceName = "workout_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "workout_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer workoutId;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private UserEntity userEntity;

    @Column(
            name = "workout_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String workoutName;

    @Column(
            name = "workout_type",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String workoutType;

    @Column(
            name = "workout_date",
            columnDefinition = "DATE",
            nullable = false
    )
    private Date workoutDate;

    @Column(
            name = "duration",
            columnDefinition = "INT"
    )
    private Integer workoutDuration;

    @Column(
            name = "intensity",
            columnDefinition = "TEXT"
    )
    private String intensity;
}
