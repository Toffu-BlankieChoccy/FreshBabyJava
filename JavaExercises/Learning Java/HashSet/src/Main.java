import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxfordDupelicate = new Room("Oxford", "Suite", 5, 225.0);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Set<Room> otherRooms = Set.of(piccadilly, oxford);
        //otherRooms.add(victoria);

        Set<Room> rooms = new LinkedHashSet<>();
        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDupelicate);
        rooms.add(victoria);

        Set<Room> moreRooms = Set.copyOf(rooms);
        moreRooms.stream()
                .map(room -> room.getName())
                .forEach(System.out::println);

    }
}