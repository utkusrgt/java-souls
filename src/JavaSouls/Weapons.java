package JavaSouls;

public class Weapons {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapons(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapons[] weapons() {
        Weapons[] weaponlist = new Weapons[3];
        weaponlist[0] = new Weapons(1, "Rivers of Blood", 2, 10);
        weaponlist[1] = new Weapons(2, "Hand of Malenia", 3, 15);
        weaponlist[2] = new Weapons(3, "Greatsword     ", 7, 45);
        return weaponlist;
    }
    public static Weapons getWeaponByObjID(int id){
        for (Weapons w : Weapons.weapons()){
            if(w.getId() == id){
                return w;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
