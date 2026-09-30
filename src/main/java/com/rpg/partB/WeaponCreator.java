package com.rpg.partB;

public abstract class WeaponCreator {

    public abstract Weapon createWeapon();

    public String executeAttackSequence(int targetArmor, int criticalMultiplier) {
        Weapon weapon = createWeapon();
        int damage = weapon.calculateCriticalDamage(criticalMultiplier);
        int finalDamage = Math.max(0, damage - targetArmor);

        return String.format("Attack with [%s]! Final Damage: %d", weapon.getName(), finalDamage);
    }
}