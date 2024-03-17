package JavaSouls;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start(){

        System.out.println("Welcome to Java Souls");
        System.out.print("Please enter your name : ");
        //System.out.println("Please select difficulty");       //Future update
        String playerName = input.nextLine();
        Player player1 = new Player(playerName, 4);
        System.out.println(player1.getName() + " Welcome to the Java Souls");
        System.out.println();
        System.out.println("Available Travelers");
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        player1.selectChar();



        Location location;
        while (true) {
            System.out.println();
            player1.playerInfo();
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("Locations");
            System.out.println();
            Location[] locationList = {new SafeHouse(player1), new ToolStore(player1), new Cave(player1), new Forest(player1), new River(player1), new Mines(player1)};
            for (Location locations : locationList) {

                System.out.println(locations.getId() +
                        "\t" + locations.getName());
                System.out.println();

            }
            System.out.println("0   Exit Game");
            System.out.print("Please select a location: ");

            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player1);
                    break;
                case 2:
                    location = new ToolStore(player1);
                    break;
                case 3:
                    location = new Cave(player1);
                    break;
                case 4:
                    location = new Forest(player1);
                    break;
                case 5:
                    location = new River(player1);
                    break;
                case 6:
                    location = new Mines(player1);
                    break;
                default:
                    location = new SafeHouse(player1);

            }

            if(location == null){
                System.out.println("Exiting from the game");
                break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER");
                break;
            }

        }
    }
}
