package tech.aelson.algorithms.sort.selection_sort

import tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.util.Util

class SelectionSortTester {
    static void main(String[] args) {
        Product[] products = Util.getUnsortedProducts()
        Util.printArray("Original array: ", products)

        SelectionSort.execute(products, products.length)
        Util.printArray("Sorted array: ", products)
    }
}
