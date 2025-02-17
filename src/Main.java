import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Room> rooms = Room.getRooms();
        Hotel hotel = Hotel.getInstance(rooms);
        RoomType roomType = RoomType.getInputRoomType();
        Hotel.getRoomsByType(hotel, roomType);
    }
}
