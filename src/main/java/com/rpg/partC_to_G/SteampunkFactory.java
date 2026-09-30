package com.rpg.partC_to_G;

public class SteampunkFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new SteampunkWeapon();
    }

    @Override
    public Armor createArmor() {
        return new SteampunkArmor();
    }

    @Override
    public SpecialAbility createSpecialAbility() {
        return new SteampunkAbility();
    }
}
