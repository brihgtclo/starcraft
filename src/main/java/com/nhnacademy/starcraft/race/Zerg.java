package com.nhnacademy.starcraft.race;

import com.nhnacademy.starcraft.unit.zerg.flyable_unit.Guardian;
import com.nhnacademy.starcraft.unit.zerg.flyable_unit.Mutalisk;
import com.nhnacademy.starcraft.unit.zerg.gound_unit.Hydralisk;
import com.nhnacademy.starcraft.unit.zerg.gound_unit.Ultralisk;
import com.nhnacademy.starcraft.unit.zerg.gound_unit.Zergling;

public class Zerg extends Race{
    public Zerg() {
        super("Zerg");
        setList();
        setUnitNumber(8);
    }

    private void setList() {
        add(new Zergling());
        add(new Hydralisk());
        add(new Ultralisk());
        add(new Mutalisk());
        add(new Guardian());
    }
}
