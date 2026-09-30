package com.rpg.partC_to_G;

public class SciFiFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new SciFiWeapon(); }
    public Armor createArmor() { return new SciFiArmor(); }
    public SpecialAbility createSpecialAbility() { return new SciFiAbility(); }
}