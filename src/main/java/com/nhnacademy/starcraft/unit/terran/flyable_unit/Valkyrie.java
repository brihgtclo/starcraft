package com.nhnacademy.starcraft.unit.terran.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.terran.TerranUnit;

public class Valkyrie extends TerranUnit implements FlyableUnit {
    public Valkyrie() {
        super("Valkyrie", true, 4, 4, 12);
    }
}
