package Practice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Room piccadilly = new Room("Piccadilly", "Practice.Guest Practice.Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Map<Room, Guest> assignments = new HashMap<>();
        assignments.put(oxford, maria);
        assignments.put(piccadilly, john);

        //Set<Map.Entry<Practice.Room, Practice.Guest>> cv =  assignments.entrySet();


        for (Map.Entry<Room, Guest> entry : assignments.entrySet()){
            Room r = entry.getKey();
            Guest g = entry.getValue();
            System.out.format("%s : %s%n", r.getName(), g.getFirstName());
        }
    }
}