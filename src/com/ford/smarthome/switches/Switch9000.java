package com.ford.smarthome.switches;

import com.ford.smarthome.switchable.LightBulb2300;

class Switch9000 {

    private LightBulb2300 lightBulb2300;
    private boolean on = false;

    Switch9000(LightBulb2300 lightBulb2300) {
        this.lightBulb2300 = lightBulb2300;
    }

    boolean isOn() {
        return on;
    }

    void press() {
        if(isOn()) {
            lightBulb2300.turnOff();
            on = false;
        } else {
            lightBulb2300.turnOn();
            on = true;
        }
    }
}
