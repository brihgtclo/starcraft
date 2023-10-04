package com.nhnacademy.starcraft.race;

import com.nhnacademy.starcraft.unit.FlyableUnit;
import com.nhnacademy.starcraft.unit.GroundUnit;
import com.nhnacademy.starcraft.unit.Unit;
import com.nhnacademy.starcraft.unit.UnitForm;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

public class Race {
    private String raceName;
    private Random random = new Random();
    private List<Unit> unitList = new ArrayList<>();
    private List<GroundUnit> groundUnitList = new ArrayList<>();
    private List<FlyableUnit> airUnitList = new ArrayList<>();
    private int unitNumber;

    public String getRaceName() {
        return raceName;
    }

    public Race(String raceName) {
        this.raceName = raceName;
    }

    public Unit getAirUnit() {
        Unit temp = airUnitList.get(randomNum(airUnitList));
        return new UnitForm(temp.getName(), temp.isFlyable(), temp.getGroundDmg(), temp.getAirDmg(), temp.getArmor());
    }

    public Unit getGroundUnit() {
        Unit temp = groundUnitList.get(randomNum(groundUnitList));
        return new UnitForm(temp.getName(), temp.isFlyable(), temp.getGroundDmg(), temp.getAirDmg(), temp.getArmor());
    }
    public Unit getRandomUnit(){
        Unit temp = unitList.get(randomNum(unitList));
        return new UnitForm(temp.getName(), temp.isFlyable(), temp.getGroundDmg(), temp.getAirDmg(), temp.getArmor());
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }
    public void add(FlyableUnit unit) {
        airUnitList.add(unit);
        unitList.add(unit);
    }

    public void add(GroundUnit unit) {
        groundUnitList.add(unit);
        unitList.add(unit);
    }
    public List<Unit> getRandomUnitList() {
        List<Unit> list = new ArrayList<>();
        for (int i = 0; i < unitNumber; i++) {
            list.add(getRandomUnit());
        }
        return list;
    }

    private int randomNum(@NotNull List lis) {
        return random.nextInt(lis.size());
    }
}
