package com.ford.smarthome.switches;

import com.ford.smarthome.switchable.LightBulb2300;
import org.junit.Test;

public class Switch9000Test {

    @Test
    public void pressSwitch() {
        Switch9000 switch9000 = new Switch9000(new LightBulb2300());

        switch9000.press();
        switch9000.press();
    }
}