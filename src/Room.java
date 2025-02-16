public enum Room {
    Standart(1, "Standart", 1, 100, "Standart room with one bed"),
    Studio(2, "Studio", 2, 200, "Studio room with two beds"),
    JuniorSuite(3, "JuniorSuite", 3, 300, "JuniorSuite room with three beds"),
    Suite(4, "Suite", 4, 400, "Suite room with four beds"),
    DeluxeSuite(5, "DeluxeSuite", 5, 500, "DeluxeSuite room with five beds"),
    PresidentSuite(6, "PresidentSuite", 6, 600, "PresidentSuite room with six beds");

    private final int roomNumber;
    private final String roomType;
    private final int capacity;
    private final double price;
    private final String description;


    Room(int roomNumber, String roomType, int capacity, double price, String description) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.price = price;
        this.description = description;
    }

}
