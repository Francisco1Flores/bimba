package org.sistema.bimba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column
    private Float total;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}
