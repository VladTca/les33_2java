import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hotel {
    private final List<Room> rooms;
    private static Hotel INSTANCE = null;

    private Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public static Hotel getInstance(List<Room> rooms) {
        if (INSTANCE == null) {
            INSTANCE = new Hotel(rooms);
        }
        return INSTANCE;
    }

    public static void getRoomsByType(Hotel hotel, RoomType roomType) {
        List<Room> filteredRooms = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (room.roomType().equals(roomType)) {
                filteredRooms.add(room);
            }
        }

        filteredRooms.sort(Comparator.comparingInt(Room::number));
        for (Room room : filteredRooms) {
            System.out.println(room);
        }

//        hotel.getRooms().stream()
//                .filter(room -> room.roomType().equals(roomType)
//                .sorted((room1, room2) -> Integer.compare(room1.number(), room2.number()))
//                .forEach(System.out::println);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return String.format("Количество номеров: %s,%n" +
                "Список номеров: %s", rooms.size(), rooms);
    }
}


