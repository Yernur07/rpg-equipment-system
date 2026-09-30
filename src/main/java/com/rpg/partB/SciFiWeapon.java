package com.rpg.partB;

public class SciFiWeapon implements Weapon {
    @Override
    public String getName() { return "Laser Blaster"; }

    @Override
    public int getBaseDamage() { return 45; }

    @Override
    public int calculateCriticalDamage(int criticalMultiplier) {
        return (getBaseDamage() * criticalMultiplier) + 10;
    }
}
