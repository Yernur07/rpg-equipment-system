package com.rpg.partC_to_G;

public class FantasyFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new FantasyWeapon(); }
    public Armor createArmor() { return new FantasyArmor(); }
    public SpecialAbility createSpecialAbility() { return new FantasyAbility(); }
}
