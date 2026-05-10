package part1;

import java.util.Date;

public class Book {
    private final int BIGBOOK = 500;
    private final int MINPRICE = 250;
    private final int ONEPAGEPRICE = 3;

    String author;
    String title;
    int releaseYear;
    int pages;

    public Book(String author, String title, int releaseYear, int pages) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > BIGBOOK;
    }

    public boolean matches(String word) {
        return  author.contains(word) || title.contains(word);
    }

    public int estimatePrice() {
        return Math.max(pages * ONEPAGEPRICE, MINPRICE);
    }
}
