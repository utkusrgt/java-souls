package JavaSouls;

import java.util.Locale;
import java.util.Random;

public abstract  class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(int id,Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(id, player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();

        System.out.println("You are in a " + this.getName());
        System.out.println(this.getObstacle().getName() + " territory");
        System.out.println(obsNumber + " " + this.getObstacle().getName() + " lives here");
        System.out.println("<F>ight or <R>un");
        String selectAction = inp.nextLine();
        if (selectAction.equalsIgnoreCase("f")){
            System.out.println("Ready for fight");
            if (combat(obsNumber)){
                System.out.println("Victory Achived");
                return true;
            }


        }

        if(this.getPlayer().getHealth() < 0){
            System.out.println("You Died !");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber){
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getDefHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<H>it or <R>un");
                String selectCombat = inp.nextLine();
                if(selectCombat.equalsIgnoreCase("h")){
                    System.out.println("You hit");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Got Hit");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmors().getBlock();
                        if (obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }else {
                    return false;
                }


            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println(getObstacle().getName() + " destroyed");
                System.out.println(this.getObstacle().getAward() + " gold received");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Current money : " + getPlayer().getMoney());
            }else{
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Foe Health  : " + this.getObstacle().getHealth());
    }

    public void playerStats(){
        System.out.println(" - Player info - ");
        System.out.println("--------------------");
        System.out.print("Health : " + this.getPlayer().getHealth());
        System.out.print("\tWeapon : " + this.getPlayer().getInventory().getWeapons().getName() );
        System.out.print("\tDamage : " + this.getPlayer().getTotalDamage());
        System.out.print("\tArmor : " + this.getPlayer().getInventory().getArmors().getName());
        System.out.print("\tblock : " + this.getPlayer().getInventory().getArmors().getBlock());
        System.out.print("\tMoney : " + this.getPlayer().getMoney());

    }

    public void obstacleStats(int i){
        System.out.println(" - Foe info - ");
        System.out.println((i) + ". " + this.getObstacle().getName());
        System.out.println("--------------------");
        System.out.println("Health : " + getObstacle().getHealth()
                + "\t Damage : " + getObstacle().getDamage()
                + "\tAward : " + getObstacle().getAward());
    }
    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
