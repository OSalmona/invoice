package com.ITAmbition.Version1.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@Embeddable
public class OrderID implements Serializable {
    private int order_id;
    private int item_id;

    public OrderID() {
    }

    public OrderID(int order_id, int item_id) {
        this.order_id = order_id;
        this.item_id = item_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "OrderID{" +
                "order_id=" + order_id +
                ", item_id=" + item_id +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        OrderID that = (OrderID) o;
//        return order_id.equals(that.order_id) &&
//                item_id.equals(that.item_id);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(order_id, item_id);
//    }
}
