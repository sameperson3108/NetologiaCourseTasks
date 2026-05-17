package part2.excepttions;

public class Main {
    static void main() throws Exception {
        System.out.println(sameLength("Petro "));
    }

    public static boolean sameLength(String text) {
        String[] parts = text.split(" ");
        if (parts.length != 2) {
            throw new NameInputmismatchException(text);
        }
        String name = parts[1];
        String lastName = parts[0];

        return name.length() == lastName.length();
    }
}
