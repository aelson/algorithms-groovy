package tech.aelson.algorithms.sort

import tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.search.SearchSmallest

class SelectionSort {
    static void execute(Product[] products, int numberOfElements) {
        (0..<numberOfElements - 1).each { current ->
            println "I am in the element $current"

            def smallest = SearchSmallest.execute(products, current, products.length - 1)

            println "<-> Swapping element $current with element $smallest"

            def currentProduct = products[current]
            def smallestProduct = products[smallest]

            println "<-> Swapping product ${currentProduct.name} with product ${smallestProduct.name}"

            products[current] = smallestProduct
            products[smallest] = currentProduct
            println "------------------------------------"
        }
    }
}
