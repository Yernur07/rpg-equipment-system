package com.rpg.partC_to_G;

public class SteampunkWeapon implements Weapon {
    @Override
    public String getName() {
        return "Steam Revolver";
    }

    @Override
    public int getDamage() {
        return 40;
    }
}