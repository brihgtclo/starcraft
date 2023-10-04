package com.nhnacademy.starcraft.player;

import com.nhnacademy.starcraft.race.Race;
import com.nhnacademy.starcraft.unit.Unit;
import java.util.List;

public class Player {
    private final List<Unit> unitList;
    private final Race race;
    public Player(Race race) {
        this.race = race;
        unitList = race.getRandomUnitList();
    }
    public List<Unit> getUnitList() {
        return unitList;
    }
    public Unit getUnit(int index) {
        return unitList.get(index);
    }
    public void attack(Unit attacker, Unit defender, List<Unit> list) {
        defender.takeDamage(attacker);
        checkManagerStatus(defender, list);
    }

    private void checkManagerStatus(Unit defender, List<Unit> list) {
        if(defender.getArmor() <= 0) delete(defender, list);
    }

    private void delete(Unit defender, List<Unit> list) {
        list.remove(research(defender, list));
    }

    private int research(Unit defender, List<Unit> list) {
        int index = 0;
        for (Unit u : list){
            if(defender.equals(u)) return index;
            index++;
        }
        throw new IllegalArgumentException("입려하신 유닛은 없는 유닛 입니다");
    }

    public Race getRace() {
        return race;
    }
}