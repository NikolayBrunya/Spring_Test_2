package org.example;

public class SedanProductionLine implements ProductionLine{
    @Override
    public Car work() {
        return new Car("Sedan");
    }
}
