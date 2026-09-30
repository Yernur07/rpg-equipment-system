package com.rpg.partC_to_G;

public class GameClient {
    private final Weapon weapon;
    private final Armor armor;
    private final SpecialAbility ability;

    public GameClient(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
        this.ability = factory.createSpecialAbility();
    }

    // Бизнес-сценарий 1: Расчет полной боевой мощи
    public int executeFullCombatCombo() {
        return ability.applyPower(weapon, armor);
    }

    // Бизнес-сценарий 2: Симуляция получения урона через кубик защиты
    public int simulateDefensiveStance(int incomingDamage) {
        int EffectiveDefense = armor.getDefense() * 2;
        return Math.max(0, incomingDamage - EffectiveDefense);
    }

    // Бизнес-сценарий 3: Снаряжение персонажа для отчета
    public String getEquipmentSummary() {
        return String.format("[%s] armed with [%s], wearing [%s] and using [%s]",
                weapon.getClass().getSimpleName().replace("Weapon", ""),
                weapon.getName(), armor.getName(), ability.getName());
    }

    public Weapon getWeapon() { return weapon; }
    public Armor getArmor() { return armor; }
    public SpecialAbility getAbility() { return ability; }
}