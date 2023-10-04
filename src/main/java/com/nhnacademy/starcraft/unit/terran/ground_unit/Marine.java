package com.nhnacademy.starcraft.unit.terran.ground_unit;

import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.terran.TerranUnit;

public class Marine extends TerranUnit implements GroundUnit {
    public Marine() {
        super("Marine", false, 3, 0, 10);
    }
}
