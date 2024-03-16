package JavaSouls;

public abstract class  Warior {
    private int id;
    private String charName;
    private int charDamage;
    private int health;
    private int charMoney;

    public Warior(int id, String charName,int damage, int health, int money) {
        this.charDamage = damage;
        this.health = health;
        this.charMoney = money;
        this.charName = charName;
        this.id = id;
    }


    public int getCharDamage() {
        return charDamage;
    }

    public void setCharDamage(int charDamage) {
        this.charDamage = charDamage;
    }

    public int getCharMoney() {
        return charMoney;
    }

    public void setCharMoney(int charMoney) {
        this.charMoney = charMoney;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
