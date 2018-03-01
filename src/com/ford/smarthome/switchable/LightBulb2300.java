package com.ford.smarthome.switchable;

public class LightBulb2300 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on \uD83D\uDCA1");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off \uD83D\uDC7B");
    }
}
