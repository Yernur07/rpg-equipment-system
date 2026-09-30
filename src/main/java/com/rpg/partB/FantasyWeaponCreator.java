package com.rpg.partB;

public class FantasyWeaponCreator extends WeaponCreator {
    @Override
    public Weapon createWeapon() {
        return new FantasyWeapon();
    }
}
