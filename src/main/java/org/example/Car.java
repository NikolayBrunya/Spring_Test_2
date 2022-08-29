package org.example;

public class Car {
    private String carName;

    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    private boolean partsDelivered;
    public Car(String carName, boolean partsDelivered) {
        this.carName = carName;
        this.partsDelivered = partsDelivered;
    }


}
