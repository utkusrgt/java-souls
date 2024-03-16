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
        System.out.println();
        System.out.println("Available Travelers");
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        player1.selectChar();


        Location location =null;
        while (true) {
            System.out.println();
            player1.playerInfo();
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("Locations");
            System.out.println();
            Location[] locationList = {new SafeHouse(player1), new ToolStore(player1)};
            for (Location locations : locationList) {

                System.out.println(locations.getId() +
                        "\t" + locations.getName());
                System.out.println();


            }
            System.out.print("Please select a location: ");

            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player1);
                    break;
                case 2:
                    location = new ToolStore(player1);
                    break;
                default:
                    location = new SafeHouse(player1);

            }


            if(!location.onLocation()){
                System.out.println("You Died");
            }

        }
    }
}
