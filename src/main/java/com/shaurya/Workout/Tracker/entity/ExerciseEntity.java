package com.shaurya.Workout.Tracker.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "ExerciseDetails")
@Data
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExerciseEntity {
    @Id
    @SequenceGenerator(
            name = "exercise_sequence",
            sequenceName = "exercise_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "exercise_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private int exerciseId;

    @Column(
            name = "exercise_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String exerciseName;

    @Column(
            name = "reps",
            nullable = false,
            columnDefinition = "INT"
    )
    private Integer reps;

    @Column(
            name = "sets",
            nullable = false,
            columnDefinition = "INT"
    )
    private Integer sets;

    @Column(
            name = "weights",
            nullable = false,
            columnDefinition = "INT"
    )
    private Integer weights;

    @Column(
            name = "rest_time",
            columnDefinition = "INT"
    )
    private Integer restTime;
}
