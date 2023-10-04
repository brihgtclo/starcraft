package com.nhnacademy.starcraft.player;

import com.nhnacademy.starcraft.race.Race;
import com.nhnacademy.starcraft.unit.Unit;
import java.util.List;

public class User extends Player{
    public User(Race race) {
        super(race);
    }
    public void strike(int attacker, int defender, List<Unit> list){
        this.attack(this.getUnit(attacker), list.get(defender), list);
    }
}
