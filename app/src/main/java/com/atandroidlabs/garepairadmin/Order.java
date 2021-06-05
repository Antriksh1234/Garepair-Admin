package com.atandroidlabs.garepairadmin;

public class Order {
    String id;
    String nameOfOwner;
    String carName;
    boolean status;

    Order(String id, String nameOfOwner, String carName, boolean status) {
        this.id = id;
        this.carName = carName;
        this.nameOfOwner = nameOfOwner;
        this.status = status;
    }
}
