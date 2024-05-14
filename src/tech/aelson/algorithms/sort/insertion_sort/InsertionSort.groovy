package tech.aelson.algorithms.sort.insertion_sort

import tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.util.Util

class InsertionSort {
    static void execute(Product[] products) {
        (1..<products.length).each { current ->
            println "I am in the element $current"
            def elementBeingAnalysed = current
            while (elementBeingAnalysed > 0 && products[elementBeingAnalysed].price < products[elementBeingAnalysed - 1].price) {
                Util.swap(products, elementBeingAnalysed, elementBeingAnalysed - 1)
                elementBeingAnalysed--
            }
        }
    }
}
