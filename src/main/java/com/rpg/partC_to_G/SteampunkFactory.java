package com.rpg.partC_to_G;

public class SteampunkFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new SteampunkWeapon(); }
    public Armor createArmor() { return new SteampunkArmor(); }
    public SpecialAbility createSpecialAbility() { return new SteampunkAbility(); }
}
