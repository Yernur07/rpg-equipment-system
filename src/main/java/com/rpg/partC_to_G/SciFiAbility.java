package com.rpg.partC_to_G;

public class SciFiAbility implements SpecialAbility {
    @Override
    public String getName() {
        return "Orbital Strike";
    }

    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return (weapon.getDamage() + armor.getDefense()) * 3;
    }
}