package com.rpg.partA;

class CyberWeapon {
    public int getPlasmaDamage() { return 50; }
}
class CyberArmor {
    public int getEnergyShield() { return 20; }
}

class FantasyWeapon {
    public int getPhysicalDamage() { return 35; }
}
class FantasyArmor {
    public int getArmorRating() { return 40; }
}

class SciFiWeapon {
    public int getLaserDamage() { return 45; }
}
class SciFiArmor {
    public int getNanoShield() { return 30; }
}

public class ClientWithoutFactories {
    private String environment;

    private CyberWeapon cyberWeapon;
    private CyberArmor cyberArmor;

    private FantasyWeapon fantasyWeapon;
    private FantasyArmor fantasyArmor;

    private SciFiWeapon sciFiWeapon;
    private SciFiArmor sciFiArmor;

    public ClientWithoutFactories(String environment) {
        this.environment = environment;

        if (environment.equalsIgnoreCase("CYBERPUNK")) {
            this.cyberWeapon = new CyberWeapon();
            this.cyberArmor = new CyberArmor();
        } else if (environment.equalsIgnoreCase("FANTASY")) {
            this.fantasyWeapon = new FantasyWeapon();
            this.fantasyArmor = new FantasyArmor();
        } else if (environment.equalsIgnoreCase("SCIFI")) {
            this.sciFiWeapon = new SciFiWeapon();
            this.sciFiArmor = new SciFiArmor();
        }
    }

    public int performAttack() {
        if (environment.equalsIgnoreCase("CYBERPUNK")) {
            return cyberWeapon.getPlasmaDamage() + cyberArmor.getEnergyShield();
        } else if (environment.equalsIgnoreCase("FANTASY")) {
            return fantasyWeapon.getPhysicalDamage() + fantasyArmor.getArmorRating();
        } else if (environment.equalsIgnoreCase("SCIFI")) {
            return sciFiWeapon.getLaserDamage() + sciFiArmor.getNanoShield();
        }
        return 0;
    }

    public static void main(String[] args) {
        ClientWithoutFactories client = new ClientWithoutFactories("CYBERPUNK");
        System.out.println("Total combat power: " + client.performAttack());
    }
}
