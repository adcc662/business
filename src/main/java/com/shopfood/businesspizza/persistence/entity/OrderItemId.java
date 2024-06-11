package com.shopfood.businesspizza.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemId implements Serializable {
    private Long orderId;
    private Long itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemId that)) return false;
        return orderId.equals(that.orderId) && itemId.equals(that.itemId);
    }


    @Override
    public int hashCode() {
        return orderId.hashCode() + itemId.hashCode();
    }

}
