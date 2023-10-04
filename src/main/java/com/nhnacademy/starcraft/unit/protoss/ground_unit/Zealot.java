package com.nhnacademy.starcraft.unit.protoss.ground_unit;

import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.protoss.ProtossUnit;

public class Zealot extends ProtossUnit implements GroundUnit {
    public Zealot() {
        super("Zealot", false, 5, 0, 20);
    }
}
