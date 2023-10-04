package com.nhnacademy.starcraft.unit.protoss.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.protoss.ProtossUnit;

public class Corsair extends ProtossUnit implements FlyableUnit {
    public Corsair() {
        super("Corsair", true, 4, 4, 12);
    }
}
