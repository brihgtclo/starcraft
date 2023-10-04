package com.nhnacademy.starcraft.unit;

public interface Unit {
    void takeDamage (Unit unit);

    String getName();
    boolean isFlyable();
    int getGroundDmg();
    int getAirDmg();
    int getArmor();
    String toString();
    boolean isDeath();
    boolean equals(Object o);
    int hashCode();
}
