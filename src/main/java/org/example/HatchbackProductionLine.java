package org.example;

public class HatchbackProductionLine implements ProductionLine{

    @Override
    public Car work() {
        return new Car("Hatchback");
    }
}
