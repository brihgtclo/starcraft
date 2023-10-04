package com.nhnacademy.starcraft.unit.terran;

import com.nhnacademy.starcraft.unit.Unit;
import com.nhnacademy.starcraft.unit.UnitForm;

public class TerranUnit extends UnitForm implements Unit {
    public TerranUnit(String name, boolean flyable, int groundDmg, int airDmg, int amor) {
        super(name, flyable, groundDmg, airDmg, amor);
    }
}
