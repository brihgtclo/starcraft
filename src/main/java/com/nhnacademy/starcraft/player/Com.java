package com.nhnacademy.starcraft.player;

import com.nhnacademy.starcraft.race.Protoss;
import com.nhnacademy.starcraft.race.Race;
import com.nhnacademy.starcraft.race.Terran;
import com.nhnacademy.starcraft.race.Zerg;
import com.nhnacademy.starcraft.unit.Unit;
import java.util.List;
import java.util.Random;

public class Com extends Player{
    static Random randomNumber = new Random();
    private Com(Race race) {
        super(race);
    }
    private Unit getRandomAttacker(){
        return this.getUnit(randomNumber.nextInt(this.getUnitList().size()));
    }
    private Unit getRandomDefender(List<Unit> list){
        return list.get(randomNumber.nextInt(list.size()));
    }
    public static Com creatCom() {
        int randomNum = randomNumber.nextInt(3);
        if(randomNum == 0) return new Com(new Zerg());
        else if(randomNum == 1) return new Com(new Terran());
        return new Com(new Protoss());
    }
    public void randomAttack(List<Unit> list) {
        this.attack(getRandomAttacker(), getRandomDefender(list), list);
    }
}
