package StructuralCompositePattern.product;

import StructuralCompositePattern.product.Product;

public class Book extends Product {
    public Book(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
