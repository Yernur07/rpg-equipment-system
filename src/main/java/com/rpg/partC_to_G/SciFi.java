package com.rpg.partC_to_G;

class SciFiWeapon implements Weapon {
    @Override
    public String getName() { return "Laser Blaster"; }

    @Override
    public int getDamage() { return 45; }
}

class SciFiArmor implements Armor {
    @Override
    public String getName() { return "Nano Suit"; }

    @Override
    public int getDefense() { return 30; }
}

class SciFiAbility implements SpecialAbility {
    @Override
    public String getName() { return "Orbital Strike"; }

    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return (weapon.getDamage() + armor.getDefense()) * 3;
    }
}