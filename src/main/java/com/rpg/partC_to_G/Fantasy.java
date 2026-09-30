package com.rpg.partC_to_G;

public class FantasyWeapon implements Weapon {
    public String getName() { return "Fire Staff"; }
    public int getDamage() { return 35; }
}

public class FantasyArmor implements Armor {
    public String getName() { return "Plate Armor"; }
    public int getDefense() { return 40; }
}

public class FantasyAbility implements SpecialAbility {
    public String getName() { return "Fireball"; }
    public int applyPower(Weapon weapon, Armor armor) {
        return weapon.getDamage() + (armor.getDefense() * 2);
    }
}
