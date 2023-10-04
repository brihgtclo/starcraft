package com.nhnacademy.starcraft.unit.zerg;

import com.nhnacademy.starcraft.unit.Unit;
import com.nhnacademy.starcraft.unit.UnitForm;

public class ZergUnit extends UnitForm implements Unit {
    public ZergUnit(String name, boolean flyable, int groundDmg, int airDmg, int amor) {
        super(name, flyable, groundDmg, airDmg, amor);
    }
}
