package tech.aelson.algorithms.util

import tech.aelson.algorithms.model.Product

class Util {
    static void swap(Product[] products, int first, int second) {
        println "<-> Swapping element $first with $second"

        def firstProduct = products[first]
        def secondProduct = products[second]

        println "<-> Swapping product ${firstProduct.name} with ${secondProduct.name}"

        products[first] = secondProduct
        products[second] = firstProduct

        println "------------------------------------"
    }

    static void printArray(String arrayTitle, Product[] products) {
        println arrayTitle
        products.each { product ->
            println "${product.name} costs ${product.price}"
        }
    }

    static Product[] getUnsortedProducts() {
        return [
                new Product("Ford Escape", 30000),
                new Product("Toyota Corolla", 20000),
                new Product("Audi Q5", 45000),
                new Product("Honda Civic", 30000),
                new Product("Tesla Model 3", 50000)
        ]
    }
}
