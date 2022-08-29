package org.example;

import org.springframework.stereotype.Component;

@Component
public class HatchbackProductionLine implements ProductionLine{

    @Override
    public Car work() {
        return new Car("Hatchback", ProductionLine.getPartsDelivery());
    }
}
