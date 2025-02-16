import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private static Hotel INSTANCE =null;

    private Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public static Hotel getInstance(List<Room> rooms) {
        if (INSTANCE == null) {
            INSTANCE = new Hotel(rooms);
        }
        return INSTANCE;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                '}';
    }
}


