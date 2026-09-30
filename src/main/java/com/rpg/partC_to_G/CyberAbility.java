package com.rpg.partC_to_G;

public class CyberAbility implements SpecialAbility {
    @Override
    public String getName() { return "System Hack"; }
    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return (weapon.getDamage() * 2) + armor.getDefense();
    }
}
