package com.nhnacademy.starcraft.race;

import com.nhnacademy.starcraft.unit.terran.flyable_unit.Valkyrie;
import com.nhnacademy.starcraft.unit.terran.flyable_unit.Wraith;
import com.nhnacademy.starcraft.unit.terran.ground_unit.Goliath;
import com.nhnacademy.starcraft.unit.terran.ground_unit.Marine;
import com.nhnacademy.starcraft.unit.terran.ground_unit.Tank;

public class Terran extends Race{
    public Terran() {
        super("Terran");
        setList();
        setUnitNumber(5);
    }

    private void setList() {
        add(new Marine());
        add(new Tank());
        add(new Goliath());
        add(new Wraith());
        add(new Valkyrie());
    }
}
