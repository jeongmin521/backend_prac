package com.example.backend.entity;

import javax.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;
}
