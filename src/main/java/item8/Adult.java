package item8;

public class Adult {
    public static void main(String[] args) {
        try (Room room = new Room(5)) {
            System.out.println("good bye");
        }
    }
}
