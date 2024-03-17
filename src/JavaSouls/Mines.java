package JavaSouls;

public class Mines extends BattleLoc{
    public Mines(Player player) {
        super(6, player, "Mines", new Snake(null), null , 5);
    }
}
