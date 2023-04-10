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
@Table(name = "providers")
public class ProviderEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String codProvider;
    private String nameProvider;
    private String catProvider;
    private boolean retention;

}
