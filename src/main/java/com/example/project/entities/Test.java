package com.example.project.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "text")
public class Test {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String text;
}
