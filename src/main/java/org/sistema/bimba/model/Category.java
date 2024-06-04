package org.sistema.bimba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category {

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column
    private String name;

    @Column(name = "sup_category")
    private Integer supCategory;

    public Category(Integer id, String name) {
        categoryId = id;
        this.name = name;
        supCategory = 0;
    }

}
