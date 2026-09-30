package com.rpg.partB;

public class CyberWeaponCreator extends WeaponCreator {
    @Override
    public Weapon createWeapon() { return new CyberWeapon(); }
}
