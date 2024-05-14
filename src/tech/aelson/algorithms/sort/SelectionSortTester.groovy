package tech.aelson.algorithms.sort

import tech.aelson.algorithms.model.Product

class SelectionSortTester {
    static void main(String[] args) {
        Product[] products = [
                new Product("Ford Escape", 30000),
                new Product("Toyota Corolla", 20000),
                new Product("Audi Q5", 45000),
                new Product("Honda Civic", 30000),
                new Product("Tesla Model 3", 50000),
        ]
        println "Original array: "
        for (Product product : products) {
            println "${product.name} costs ${product.price}"
        }

        SelectionSort.execute(products, products.length)

        println "Sorted array: "
        for (Product product : products) {
            println "${product.name} costs ${product.price}"
        }
    }
}
