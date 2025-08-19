package SortingCollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Room piccadilly = new Room("Piccadilly", "SortingCollections.Guest SortingCollections.Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere SortingCollections.Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.00);
        Room oxfordGuest = new Room("Oxford", "SortingCollections.Guest SortingCollections.Room", 5, 225.00);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, cambridge, oxford, oxfordGuest, victoria));

        //Collections.sort(rooms, Comparator.naturalOrder());
        rooms.sort(Comparator.naturalOrder());

        rooms.stream()
                .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));
    }
}