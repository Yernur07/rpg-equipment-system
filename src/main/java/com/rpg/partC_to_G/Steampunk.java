package com.rpg.partC_to_G;

class SteampunkWeapon implements Weapon {
    @Override
    public String getName() { return "Steam Revolver"; }

    @Override
    public int getDamage() { return 40; }
}

class SteampunkArmor implements Armor {
    @Override
    public String getName() { return "Brass Exoskeleton"; }

    @Override
    public int getDefense() { return 35; }
}

class SteampunkAbility implements SpecialAbility {
    @Override
    public String getName() { return "Overpressure Burst"; }

    @Override
    public int applyPower(Weapon weapon, Armor armor) {
        return weapon.getDamage() + armor.getDefense() + 25;
    }
}