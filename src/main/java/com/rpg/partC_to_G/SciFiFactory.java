package com.rpg.partC_to_G;

public class SciFiFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new SciFiWeapon();
    }

    @Override
    public Armor createArmor() {
        return new SciFiArmor();
    }

    @Override
    public SpecialAbility createSpecialAbility() {
        return new SciFiAbility();
    }
}