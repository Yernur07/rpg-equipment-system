package com.rpg.partC_to_G;

public class FantasyWeapon implements Weapon {
    @Override
    public String getName() {
        return "Fire Staff";
    }

    @Override
    public int getDamage() {
        return 50;
    }
}
