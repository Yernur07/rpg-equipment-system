package com.rpg.partB;

public interface Weapon {
    String getName();
    int getBaseDamage();
    int calculateCriticalDamage(int criticalMultiplier);
}