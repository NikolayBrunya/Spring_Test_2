package org.example;

import org.example.events.CustomEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class AutoFactory {

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    private int productionSize;
    private ProductionLine productionLine;
    private Collection<Car> cars;

    public AutoFactory() {
        //cars = new ArrayList<Car>();
    }

    @Autowired
    public AutoFactory(@Qualifier("SedanPL") ProductionLine productionLine) {
        this.productionLine = productionLine;
        //cars = new ArrayList<Car>();
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
        //cars = new ArrayList<Car>();
    }

    public void run() {
        int i = 0;
        Car new_car;
        while (i < productionSize) {
            new_car = productionLine.work();
            if (new_car.isPartsDelivered()) {

                cars.add(new_car);
//                CustomEventPublisher eventPublisher = new CustomEventPublisher();
//                eventPublisher.publishCustomEvent("Car built");
            }
            i++;
        }
    }
@PostConstruct
public void initMethod(){
    cars = new ArrayList<Car>();
}
    public int getNumCars(){
        return cars.size();
    }

}
