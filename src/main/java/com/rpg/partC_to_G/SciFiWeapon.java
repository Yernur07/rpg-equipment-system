package com.rpg.partC_to_G;

public class SciFiWeapon implements Weapon {
    @Override
    public String getName() {
        return "Laser Blaster";
    }

    @Override
    public int getDamage() {
        return 45;
    }
}