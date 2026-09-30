package com.rpg.partC_to_G;

public class SteampunkAbility implements SpecialAbility {
    @Override
    public String getName() {
        return "Overpressure Burst";
    }

    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return weapon.getDamage() + armor.getDefense() + 25;
    }
}
