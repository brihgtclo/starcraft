package com.nhnacademy.starcraft.unit.terran.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.terran.TerranUnit;

public class Wraith extends TerranUnit implements FlyableUnit {
    public Wraith() {
        super("Wraith", true, 3, 3, 10);
    }
}
