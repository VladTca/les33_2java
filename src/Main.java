import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RoomType roomType = null;
        List<Room> rooms = Room.getRooms();
        Hotel hotel = Hotel.getInstance(rooms);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.printf("""
                    Выберите тип номера для выборки:
                    1 - Standart
                    2 - Studio
                    3 - JuniorSuit
                    4 - Suit
                    5 - DeLuxe
                    6 - President
                    Введите номер: """);

            int choice = Integer.parseInt(reader.readLine());
            if (choice < 1 || choice > 6) {
                throw new IllegalArgumentException("Неверный выбор! Пожалуйста, введите число от 1 до 6.");
            }

            roomType = switch (choice) {
                case 1 -> RoomType.STANDART;
                case 2 -> RoomType.STUDIO;
                case 3 -> RoomType.JUNIORSUIT;
                case 4 -> RoomType.SUIT;
                case 5 -> RoomType.DELUXESUIT;
                case 6 -> RoomType.PRESIDENTSUIT;
                default -> throw new IllegalArgumentException("Неверный выбор!");
            };

            Hotel.getRoomsByType(hotel, roomType);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Введите корректное число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

}
