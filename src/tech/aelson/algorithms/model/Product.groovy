package tech.aelson.algorithms.model

class Product {
    private final String name
    private final double price

    Product(String name, double price) {
        this.name = name
        this.price = price
    }

    double getPrice() {
        return price
    }

    String getName() {
        return name
    }
}