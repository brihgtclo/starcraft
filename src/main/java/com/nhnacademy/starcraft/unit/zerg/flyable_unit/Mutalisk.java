package com.nhnacademy.starcraft.unit.zerg.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.zerg.ZergUnit;

public class Mutalisk extends ZergUnit implements FlyableUnit {
    public Mutalisk(){
        super("Mutalisk", true, 2, 2, 8);
    }
}
