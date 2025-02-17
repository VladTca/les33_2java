public enum RoomType {
    STANDART( 100, "Standart room with one bed"),
    STUDIO( 200, "Studio room with two beds"),
    JUNIORSUIT( 300, "JuniorSuite room with three beds"),
    SUIT(400, "Suite room with four beds"),
    DELUXESUIT( 500, "DeluxeSuite room with five beds"),
    PRESIDENTSUIT(600, "PresidentSuite room with six beds");


    private final double price;
    private final String description;


    RoomType(double price, String description) {

        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Цена за номер: %s,%n" +
                "описание: %s",price,description);
    }
}
