package JavaSouls;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(1, player, "Round Table ");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Round Table");
        System.out.println("Humanity Restored");
        return true;
    }
}
