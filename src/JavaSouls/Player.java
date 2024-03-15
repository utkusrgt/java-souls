package JavaSouls;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner inp = new Scanner(System.in);

    public Player(String name) {

        this.name = name;

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

    public int getHealth() {
        return health;
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

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar(){


        Warior[] wariorlist = {new Samurai(), new Knight()};

        for (Warior warior : wariorlist){
            System.out.println("ID " + warior.getId() +
                    "\t" + warior.getCharName() +
                    "\t Damage : " +  warior.getDamage() +
                    "\t Health : " + warior.getHealth() +
                    "\tMoney : " + warior.getMoney());


        }
        System.out.print("Please select : ");
        int selectChar = inp.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
        }//while
        System.out.println("Your Charachter is " + this.getName());

    }
    public void initPlayer(Warior warior){
        this.setDamage(warior.getDamage());
        this.setHealth(warior.getHealth());
        this.setMoney(warior.getMoney());
        this.setName(warior.getCharName());

    }
}
