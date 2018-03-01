package com.ford.smarthome.switches;

class Switch9000 {

    private Switchable switchable;
    private boolean on = false;

    Switch9000(Switchable switchable) {
        this.switchable = switchable;
    }

    boolean isOn() {
        return on;
    }

    void press() {
        if(isOn()) {
            switchable.turnOff();
            on = false;
        } else {
            switchable.turnOn();
            on = true;
        }
    }
}
