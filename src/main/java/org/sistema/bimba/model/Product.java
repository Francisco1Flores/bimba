package org.sistema.bimba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Product {

    @Id
    public Integer id;

    @Column
    public String name;

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
