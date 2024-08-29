package com.shaurya.Workout.Tracker.User.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "UserEntity")
@Data
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Integer id;

    @Column(
            name = "username",
            nullable = false
    )
    private String username;

    @Column(
            name = "password",
            nullable = false
    )
    private String password; //TODO: add the password encryption system
}
