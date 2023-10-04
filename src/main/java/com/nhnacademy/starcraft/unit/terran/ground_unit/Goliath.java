package com.nhnacademy.starcraft.unit.terran.ground_unit;

import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.terran.TerranUnit;

public class Goliath extends TerranUnit implements GroundUnit {
    public Goliath() {
        super("Goliath", false, 5, 5, 15);
    }
}
