package com.rpg.partC_to_G;

public class FactoryProvider {
    public static EquipmentFactory getFactory(String env) {
        if (env == null) {
            throw new IllegalArgumentException("Environment cannot be null");
        }
        return switch (env.toUpperCase()) {
            case "CYBERPUNK" -> new CyberpunkFactory();
            case "FANTASY" -> new FantasyFactory();
            case "SCIFI" -> new SciFiFactory();
            case "STEAMPUNK" -> new SteampunkFactory();
            default -> throw new IllegalArgumentException("Unknown environment: " + env);
        };
    }
}