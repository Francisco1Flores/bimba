package org.sistema.bimba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {

    @Id
    @Column(name = "supplier_id")
    private Integer id;

    @Column
    private String name;

    @Column
    private String cellNumber;



}
