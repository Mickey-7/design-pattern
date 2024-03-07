package StructuralFlyweightPattern;

public class Book {
    private String name;
    private double price;
    private BookType tytpe;

    public Book(String name, double price, BookType tytpe) {
        this.name = name;
        this.price = price;
        this.tytpe = tytpe;
    }
}
