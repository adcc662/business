package com.shopfood.businesspizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@IdClass(OrderItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderItem {

    @Id
    @Column(name = "order_id", nullable = false)
    private long orderId;

    @Id
    @Column(name = "item_id", nullable = false)
    private long itemId;

    @Column(name = "id_pizza", nullable = false)
    private long idPizza;

    @Column(nullable = false, columnDefinition = "DECIMAL(2,1)")
    private Double quantity;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pizza",referencedColumnName = "id", insertable = false, updatable = false)
    private Pizza pizza;

}
