package JavaSouls;

public class Armor {
    private int id;
    private String name;
    private int health;
    private int price;

    public Armor(int id, String name, int health, int price) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Black Knife Set", 1, 10);
        armorList[1] = new Armor(2, "Crucible Tree Armor", 3, 15);
        armorList[2] = new Armor(3, "Raging Wolf Armor", 5, 45);
        return armorList;
    }
    public static Armor getArmorByObjID(int id){
        for (Armor a : Armor.armors()){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}