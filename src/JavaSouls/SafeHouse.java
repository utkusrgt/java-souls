package JavaSouls;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(1, player, "Round Table ");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Round Table");
        System.out.println("Humanity Restored");
        this.getPlayer().setHealth(this.getPlayer().getDefhealt());
        if(getPlayer().getBag().hasAllItems()) {
            System.out.println("Congratulations! You have collected all items and won the game!");
            return false;

        }
        return true;
    }
}
