package JavaSouls;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(2, player, "Wandering Merchant");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome Traveler");
        System.out.println("Current money : " + this.getPlayer().getMoney());
        System.out.println();
        System.out.println("1 - Weapons");
        System.out.println();
        System.out.println("2 - Armor");
        System.out.println();
        System.out.println("3 - Exit");
        System.out.println();
        int selectCase = inp.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Invalid Option");
            selectCase = inp.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
            case 3:
                return true;

        }

        return true;
    }



    public void printWeapon() {
        System.out.println("Weapons");
        System.out.println();
        System.out.println("Current money : " + this.getPlayer().getMoney());
        System.out.println();
        for (Weapons w : Weapons.weapons()) {
            System.out.println("ID : " + w.getId() +
                    "\t Name : " + w.getName() +
                    "\t Damage : " + w.getDamage() +
                    "\t Price : " + w.getPrice());
        }
    }

    public void buyWeapon(){

        System.out.println("Select Weapon");
        int selectWeponID = inp.nextInt();
        while (selectWeponID < 1 || selectWeponID > Weapons.weapons().length) {
            System.out.println("Invalid Option");
            selectWeponID = inp.nextInt();
        }
        Weapons selectedWeapon = Weapons.getWeaponByObjID(selectWeponID);

        if (selectedWeapon != null) {

            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficent resource !");
            } else {
                System.out.println(selectedWeapon.getName() + " is bought!");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Money left : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapons(selectedWeapon);

            }


        }
    }

    private void printArmor() {
        System.out.println("Armors");
        System.out.println();
        System.out.println("Current money : " + this.getPlayer().getMoney());
        System.out.println();
        for (Armor a : Armor.armors()) {
            System.out.println("ID : " + a.getId() +
                    "\t Name : " + a.getName() +
                    "\t Damage : " + a.getHealth() +
                    "\t Price : " + a.getPrice());
        }
    }

    public void buyArmor(){

        System.out.println("Select Armor");
        int selectArmorID = inp.nextInt();
        while (selectArmorID < 1 || selectArmorID > Armor.armors().length) {
            System.out.println("Invalid Option");
            selectArmorID = inp.nextInt();
        }
        Armor selectedArmor = Armor.getArmorByObjID(selectArmorID);

        if (selectedArmor != null) {

            if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficent resource !");
            } else {
                System.out.println(selectedArmor.getName() + " is bought!");
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Money left : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setArmors(selectedArmor);

            }


        }
    }
}