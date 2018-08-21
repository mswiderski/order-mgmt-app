package org.jbpm.demo.order;

public class Order {

    private int id;

    private String name;

    private String reference;

    private String origin;

    private String orderNumber = "";

    public Order(String name, String reference, String origin) {
        this.name = name;
        this.reference = reference;
        this.origin = origin;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", name=" + name + ", reference=" + reference + ", origin=" + origin + ", orderNumber=" + orderNumber + "]";
    }
}
