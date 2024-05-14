package tech.aelson.algorithms.search.find_smallest

import tech.aelson.algorithms.model.Product

class FindSmallestTester {
    static void main(String[] args) {
        Product[] products = [
                new Product("Tesla Model 3", 50000),
                new Product("Toyota Corolla", 20000),
                new Product("Ford Escape", 30000),
                new Product("Honda Civic", 30000),
                new Product("Audi Q5", 45000)
        ]

        def smallest = FindSmallest.execute(products, 0, 4)
        println smallest
        println "The car ${products[smallest].name} costs ${products[smallest].price}"
    }
}
