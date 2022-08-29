package org.example;

import org.springframework.stereotype.Component;

@Component("SedanPL")
public class SedanProductionLine implements ProductionLine{
    @Override
    public Car work() {
        return new Car("Sedan", ProductionLine.getPartsDelivery());
    }
}
