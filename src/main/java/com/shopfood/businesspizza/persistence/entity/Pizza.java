package com.shopfood.businesspizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@NoArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    @Column(nullable = false, length = 150)
    private String description;
    @Column(nullable = false, columnDefinition = "DECIMAL(5,2)")
    private Double price;
    @Column(columnDefinition = "SMALLINT")
    private boolean vegetarian;
    @Column(columnDefinition = "SMALLINT")
    private boolean vegan;
    @Column(columnDefinition = "SMALLINT", nullable = false)
    private boolean available;



}
