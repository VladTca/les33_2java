import java.util.ArrayList;
import java.util.List;

public record Room(int number, RoomType roomType, int capacity) {

    public Room {
        if (number < 0 || capacity < 0) {
            throw new IllegalArgumentException("Номер и вместимость должны быть положительными числами");
        }
        if (roomType == null) {
            throw new IllegalArgumentException("Тип номера не может быть пустым");
        }
        if (capacity < 1 || capacity > 6) {
            throw new IllegalArgumentException("Вместимость должна быть от 1 до 6 человек");
        }
    }

    public static List<Room> getRooms() {
        List<Room> rooms = new ArrayList<>() {
        };
        rooms.add(new Room(101, RoomType.STANDART, 1));
        rooms.add(new Room(102, RoomType.STANDART, 1));
        rooms.add(new Room(103, RoomType.STANDART, 1));
        rooms.add(new Room(104, RoomType.STANDART, 1));
        rooms.add(new Room(105, RoomType.STANDART, 1));
        rooms.add(new Room(106, RoomType.STANDART, 1));
        rooms.add(new Room(201, RoomType.STUDIO, 2));
        rooms.add(new Room(202, RoomType.STUDIO, 2));
        rooms.add(new Room(203, RoomType.STUDIO, 2));
        rooms.add(new Room(204, RoomType.STUDIO, 2));
        rooms.add(new Room(205, RoomType.STUDIO, 2));
        rooms.add(new Room(301, RoomType.JUNIORSUIT, 3));
        rooms.add(new Room(302, RoomType.JUNIORSUIT, 3));
        rooms.add(new Room(303, RoomType.JUNIORSUIT, 3));
        rooms.add(new Room(304, RoomType.JUNIORSUIT, 3));
        rooms.add(new Room(401, RoomType.SUIT, 4));
        rooms.add(new Room(402, RoomType.SUIT, 4));
        rooms.add(new Room(403, RoomType.SUIT, 4));
        rooms.add(new Room(501, RoomType.DELUXESUIT, 5));
        rooms.add(new Room(502, RoomType.DELUXESUIT, 5));
        rooms.add(new Room(601, RoomType.PRESIDENTSUIT, 6));
        return rooms;
    }


    @Override
    public String toString() {
        return String.format("%n%nНомер: %s,%n" +
                "Тип номера: %s,%n" +
                "Вместимость: %s", number, roomType, capacity);
    }
}
