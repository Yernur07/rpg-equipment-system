package com.rpg.partB;

public class CyberWeapon implements Weapon {
    @Override
    public String getName() { return "Plasma Rifle"; }

    @Override
    public int getBaseDamage() { return 50; }

    @Override
    public int calculateCriticalDamage(int criticalMultiplier) {
        return (getBaseDamage() * criticalMultiplier) + 15;
    }
}