package part1;

public class Main {
    static void main() {
        Book book = new Book("Dostoevsky", "Crime and Punishment", 1860, 200);
        System.out.println(book.isBig());
    }
}
