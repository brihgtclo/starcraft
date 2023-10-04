package com.nhnacademy.starcraft.unit.zerg.flyable_unit;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.zerg.ZergUnit;

public class Guardian extends ZergUnit implements FlyableUnit {
    public Guardian(){
        super("Guardian", true, 3, 3, 6);
    }
}
