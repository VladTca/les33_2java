import java.io.BufferedReader;
import java.io.InputStreamReader;

public enum RoomType {
    STANDART(100, "Standart room with one bed"),
    STUDIO(200, "Studio room with two beds"),
    JUNIORSUIT(300, "JuniorSuite room with three beds"),
    SUIT(400, "Suite room with four beds"),
    DELUXESUIT(500, "DeluxeSuite room with five beds"),
    PRESIDENTSUIT(600, "PresidentSuite room with six beds");


    private final double price;
    private final String description;


    RoomType(double price, String description) {

        this.price = price;
        this.description = description;
    }

    public static RoomType getInputRoomType() {
        RoomType roomType = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("""
                    Выберите тип номера для выборки:
                    1 - Standart
                    2 - Studio
                    3 - JuniorSuit
                    4 - Suit
                    5 - DeLuxe
                    6 - President
                    Введите номер:""");

            int choice = Integer.parseInt(reader.readLine());
            if (choice < 1 || choice > 6) {
                throw new IllegalArgumentException("Неверный выбор! Пожалуйста, введите число от 1 до 6.");
            }

            roomType = switch (choice) {
                case 1 -> STANDART;
                case 2 -> STUDIO;
                case 3 -> JUNIORSUIT;
                case 4 -> SUIT;
                case 5 -> DELUXESUIT;
                case 6 -> PRESIDENTSUIT;
                default -> throw new IllegalArgumentException("Неверный выбор!");
            };

        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Введите корректное число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
        return roomType;
    }

    @Override
    public String toString() {
        return String.format("Цена за номер: %s,%n" +
                "описание: %s", price, description);
    }
}
