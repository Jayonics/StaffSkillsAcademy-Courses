import java.util.*;

public class lab7 {
    public static void main(String[] args) {
        String[] playersArray = {"Jim","Bob","Steve","Dave","Garry"};

        List<String> players = new ArrayList<String>();
        players.add("Jim");
        players.add("Bob");
        players.add("Steve");
        players.add("Dave");
        players.add("Garry");

        System.out.println("Players before transfer window.");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }

        players.add("Jeff");
        players.add("Harry");
        players.add("Paul");
        System.out.println("Players after transfer window.");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
}
