package com.mingeso.milkstgomono.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "collections")
public class CollectionEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Date dateCollection;
    private String turn;
    private String codProvider;
    private double milkAmount;
}
