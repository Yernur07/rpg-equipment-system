package com.rpg.partC_to_G;

public class CyberpunkFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new CyberWeapon(); }
    public Armor createArmor() { return new CyberArmor(); }
    public SpecialAbility createSpecialAbility() { return new CyberAbility(); }
}
