package com.example.enterprise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "profiles_table")
@AllArgsConstructor
public class Profile {

    @Id
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "department")
    private String department;

    @Column(name = "company")
    private String company;

    @Column(name = "skill")
    private String skill;
}