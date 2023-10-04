package com.nhnacademy.starcraft.unit.terran.ground_unit;

import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.terran.TerranUnit;

public class Tank extends TerranUnit implements GroundUnit {
    public Tank() {
        super("Tank", false, 7, 0 , 15);
    }
}
