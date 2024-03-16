package JavaSouls;

public class Inventory {
    private Weapons weapons;
    private Armor armors;

    public Inventory() {
        this.weapons = new Weapons(0, "Fist", 0, 0);
        this.armors = new Armor(0,"No Armor", 0, 0 );
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Armor getArmors() {
        return armors;
    }

    public void setArmors(Armor armors) {
        this.armors = armors;
    }
}
