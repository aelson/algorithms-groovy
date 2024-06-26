package tech.aelson.algorithms.sort.selection_sort

import tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.search.find_smallest.FindSmallest
import tech.aelson.algorithms.util.Util

class SelectionSort {
    static void execute(Product[] products, int numberOfElements) {
        (0..<numberOfElements - 1).each { current ->
            println "I am in the element $current"
            def smallest = FindSmallest.execute(products, current, products.length - 1)
            Util.swap(products, current, smallest)
        }
    }
}
