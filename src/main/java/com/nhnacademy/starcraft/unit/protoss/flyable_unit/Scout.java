package com.nhnacademy.starcraft.unit.protoss.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.protoss.ProtossUnit;

public class Scout extends ProtossUnit implements FlyableUnit {
    public Scout() {
        super("Scout", true, 5, 5, 10);
    }
}
