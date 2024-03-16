package JavaSouls;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner inp = new Scanner(System.in);

    private Inventory inventory;

    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();

    }

    public void selectChar(){                                           //Charachter Selection


        Warior[] wariorlist = {new Samurai(), new Knight()};

        for (Warior warior : wariorlist){
            System.out.println("ID " + warior.getId() +
                    "\t" + warior.getCharName() +
                    "\t Damage : " +  warior.getCharDamage() +
                    "\t Health : " + warior.getHealth() +
                    "\tMoney : " + warior.getCharMoney());
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();


        }
        System.out.print("Please select your traveler : ");

        int selectChar = inp.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
        }
        //System.out.println("Your Charachter is " + this.getName());


    }

    public void initPlayer(Warior warior){                              //Player Initialize
        this.setDamage(warior.getCharDamage());
        this.setHealth(warior.getHealth());
        this.setMoney(warior.getCharMoney());
        this.setName(warior.getCharName());

    }


    public void playerInfo(){
        System.out.println(" -- " + this.getName() + " -- "
                + "\tCurrent Weapon : " + this.getInventory().getWeapons().getName()
                + "\tCurrent Armor : " + this.getInventory().getArmors().getName()
                + "\tDamage : " + this.getDamage()
                + "\tHealth : " + this.getHealth()
                + "\tMoney : " + this.getMoney()) ;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapons().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health + this.getInventory().getArmors().getHealth();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() { return charName; }
    public void setCharName(String charName) {
        this.charName = charName;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
