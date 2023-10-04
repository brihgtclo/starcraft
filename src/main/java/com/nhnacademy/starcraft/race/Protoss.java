package com.nhnacademy.starcraft.race;

import com.nhnacademy.starcraft.unit.protoss.flyable_unit.Corsair;
import com.nhnacademy.starcraft.unit.protoss.flyable_unit.Scout;
import com.nhnacademy.starcraft.unit.protoss.ground_unit.Dragoon;
import com.nhnacademy.starcraft.unit.protoss.ground_unit.HighTempler;
import com.nhnacademy.starcraft.unit.protoss.ground_unit.Zealot;

public class Protoss extends Race{
    public Protoss() {
        super("Protoss");
        setList();
        setUnitNumber(4);
    }

    private void setList() {
        add(new Zealot());
        add(new Dragoon());
        add(new HighTempler());
        add(new Scout());
        add(new Corsair());
    }
}
