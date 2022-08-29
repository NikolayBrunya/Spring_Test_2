package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class AutoFactory {

    private int productionSize;
    private ProductionLine productionLine;
    private Collection<Car> cars;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
        cars = new ArrayList<Car>();
    }

    public void run() {
        int i = 0;
        Car new_car;
        while (i < productionSize) {
            new_car = productionLine.work();
            if (new_car.isPartsDelivered()) {
                cars.add(new_car);
            }
            i++;
        }
    }

    public int getNumCars(){
        return cars.size();
    }

}
