package com.rpg.partB;

public class FantasyWeapon implements Weapon {
    @Override
    public String getName() { return "Fire Staff"; }

    @Override
    public int getBaseDamage() { return 35; }

    @Override
    public int calculateCriticalDamage(int criticalMultiplier) {
        return getBaseDamage() * criticalMultiplier;
    }
}