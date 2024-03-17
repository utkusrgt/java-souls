package JavaSouls;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(3,player, "Cave (Food)", new Zombie(), "Food", 3);
    }
}
