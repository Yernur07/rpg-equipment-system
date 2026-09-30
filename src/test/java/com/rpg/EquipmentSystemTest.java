package com.rpg;

import com.rpg.partC_to_G.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipmentSystemTest {

    @Test
    void test1_CyberpunkFactoryCreation() {
        EquipmentFactory factory = new CyberpunkFactory();
        assertTrue(factory.createWeapon() instanceof CyberWeapon);
    }

    @Test
    void test2_FantasyFactoryCreation() {
        EquipmentFactory factory = new FantasyFactory();
        assertTrue(factory.createArmor() instanceof FantasyArmor);
    }

    @Test
    void test3_SciFiFactoryCreation() {
        EquipmentFactory factory = new SciFiFactory();
        assertTrue(factory.createSpecialAbility() instanceof SciFiAbility);
    }

    @Test
    void test4_SteampunkFactoryCreation() {
        EquipmentFactory factory = new SteampunkFactory();
        assertTrue(factory.createWeapon() instanceof SteampunkWeapon);
    }

    @Test
    void test5_CompatibilityCyberpunkFamily() {
        EquipmentFactory factory = new CyberpunkFactory();
        GameClient client = new GameClient(factory);
        assertEquals("Plasma Rifle", client.getWeapon().getName());
        assertEquals("Energy Shield", client.getArmor().getName());
    }

    @Test
    void test6_CompatibilityFantasyFamily() {
        EquipmentFactory factory = new FantasyFactory();
        GameClient client = new GameClient(factory);
        assertEquals("Fire Staff", client.getWeapon().getName());
        assertEquals("Plate Armor", client.getArmor().getName());
    }

    @Test
    void test7_RuntimeFactorySelectionCyberpunk() {
        EquipmentFactory factory = FactoryProvider.getFactory("CYBERPUNK");
        assertTrue(factory instanceof CyberpunkFactory);
    }

    @Test
    void test8_RuntimeFactorySelectionSteampunk() {
        EquipmentFactory factory = FactoryProvider.getFactory("STEAMPUNK");
        assertTrue(factory instanceof SteampunkFactory);
    }

    @Test
    void test9_BusinessScenario1_CombatComboCyberpunk() {
        GameClient client = new GameClient(new CyberpunkFactory());
        // (50 * 2) + 20 = 120
        assertEquals(120, client.executeFullCombatCombo());
    }

    @Test
    void test10_BusinessScenario1_CombatComboFantasy() {
        GameClient client = new GameClient(new FantasyFactory());
        // 35 + (40 * 2) = 115
        assertEquals(115, client.executeFullCombatCombo());
    }

    @Test
    void test11_BusinessScenario2_DefensiveStance() {
        GameClient client = new GameClient(new SciFiFactory());
        // Incoming 100 - (30 * 2) = 40
        assertEquals(40, client.simulateDefensiveStance(100));
    }

    @Test
    void test12_BusinessScenario3_EquipmentSummary() {
        GameClient client = new GameClient(new FantasyFactory());
        assertTrue(client.getEquipmentSummary().contains("Fire Staff"));
    }

    @Test
    void test13_NegativeScenario_UnknownEnvironment() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.getFactory("UNKNOWN_WORLD"));
    }

    @Test
    void test14_NegativeScenario_NullEnvironment() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.getFactory(null));
    }

    @Test
    void test15_ClientWorksPurelyThroughAbstractions() {
        EquipmentFactory factory = new SteampunkFactory();
        GameClient client = new GameClient(factory);

        Weapon w = client.getWeapon();
        Armor a = client.getArmor();
        SpecialAbility sa = client.getAbility();

        assertNotNull(w);
        assertNotNull(a);
        assertNotNull(sa);
    }
}
