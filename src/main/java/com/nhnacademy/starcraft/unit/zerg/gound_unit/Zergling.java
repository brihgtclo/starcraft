package com.nhnacademy.starcraft.unit.zerg.gound_unit;

import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.zerg.ZergUnit;

public class Zergling extends ZergUnit implements GroundUnit {

    public Zergling() {
        super("Zergling", false, 2, 0, 2);
    }
}
