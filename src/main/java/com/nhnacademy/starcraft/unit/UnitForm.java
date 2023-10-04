package com.nhnacademy.starcraft.unit;

import java.util.Objects;

public class UnitForm implements Unit{
    private final String name;
    private boolean flyable;
    private int groundDmg;
    private int airDmg;
    private int armor;
    private boolean isDeath;

    public UnitForm(String name, boolean flyable, int groundDmg, int airDmg, int amor) {
        this.name = name;
        this.flyable = flyable;
        this.groundDmg = groundDmg;
        this.airDmg = airDmg;
        this.armor = amor;
    }
    @Override
    public void takeDamage (Unit unit){
        if(this.flyable) this.armor -= unit.getAirDmg();
        else this.armor -= unit.getGroundDmg();
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isFlyable() {
        return flyable;
    }
    @Override
    public int getGroundDmg() {
        return groundDmg;
    }
    @Override
    public int getAirDmg() {
        return airDmg;
    }
    @Override
    public int getArmor() {
        return armor;
    }

    public boolean isDeath() {
        return isDeath;
    }

    @Override
    public String toString() {
        return this.name + " " + "(현재 방어력: " + this.armor + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitForm unitForm = (UnitForm) o;
        return flyable == unitForm.flyable && groundDmg == unitForm.groundDmg && airDmg == unitForm.airDmg && armor == unitForm.armor && isDeath == unitForm.isDeath && Objects.equals(name, unitForm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flyable, groundDmg, airDmg, armor, isDeath);
    }
}
