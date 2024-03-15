package JavaSouls;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start(){

        System.out.println("Welcome to Java Souls");
        System.out.print("Please enter your name : ");
        //System.out.println("Please select difficulty");       //Future update
        String playerName = input.nextLine();
        Player player1 = new Player(playerName);
        System.out.println(player1.getName() + " Welcome to the Java Souls");
        System.out.println("Please select your character ! ");
        player1.selectChar();

    }
}
