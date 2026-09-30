package com.rpg.partC_to_G;

public class FantasyAbility implements SpecialAbility {
    @Override
    public String getName() {
        return "Holy Light";
    }

    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return weapon.getDamage() + armor.getDefense() + 33;
    }
}
