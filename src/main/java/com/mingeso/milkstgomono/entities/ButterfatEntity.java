package com.mingeso.milkstgomono.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "butterfat")
public class ButterfatEntity {
    @Id
    @GeneratedValue
    private Long id;
    String codProvider;
    double butterfat;
    double totalSolid;
}
