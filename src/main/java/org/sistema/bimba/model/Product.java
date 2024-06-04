package org.sistema.bimba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    public Integer code;

    @Column
    public String name;

    @Column
    private Float price;

    @Column(name = "price_kg")
    private Float priceKg;

    @Column
    private Integer quantity;

    @Column(name = "kg_per_unity")
    private Float kgPerUnity;

    @Column(name = "kg_open_bag")
    private Float kgOpenBag;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
