package com.nhnacademy.starcraft.unit.protoss;

import com.nhnacademy.starcraft.unit.Unit;
import com.nhnacademy.starcraft.unit.UnitForm;

public class ProtossUnit extends UnitForm implements Unit {
    public ProtossUnit(String name, boolean flyable, int groundDmg, int airDmg, int amor) {
        super(name, flyable, groundDmg, airDmg, amor);
    }
}
