package com.ford.smarthome.switches;

import com.ford.smarthome.switchable.LightBulb2300;
import org.junit.Test;

import static org.junit.Assert.*;

public class Switch9000Test {

    @Test
    public void pressTurnsTheSwitchOn() {
        Switch9000 switch9000 = new Switch9000(new LightBulb2300());

        switch9000.press();

        assertTrue(switch9000.isOn());
    }

    @Test
    public void pressTwiceTurnsTheSwitchOff() {
        Switch9000 switch9000 = new Switch9000(new LightBulb2300());

        switch9000.press();
        switch9000.press();

        assertFalse(switch9000.isOn());
    }
}