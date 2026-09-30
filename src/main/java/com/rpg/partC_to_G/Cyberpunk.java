package com.rpg.partC_to_G;

public class CyberWeapon implements Weapon {
    public String getName() { return "Plasma Rifle"; }
    public int getDamage() { return 50; }
}

public class CyberArmor implements Armor {
    public String getName() { return "Energy Shield"; }
    public int getDefense() { return 20; }
}

public class CyberAbility implements SpecialAbility {
    public String getName() { return "System Hack"; }
    public int applyPower(Weapon weapon, Armor armor) {
        return (weapon.getDamage() * 2) + armor.getDefense();
    }
}