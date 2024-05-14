package tech.aelson.algorithms.sort.insertion_sort

import tech.aelson.algorithms.util.Util

class InsertionSortTester {
    static void main(String[] args) {
        def products = Util.getUnsortedProducts()
        Util.printProductsArray("Original array: ", products)

        InsertionSort.execute(products)
        Util.printProductsArray("Sorted array: ", products)
    }
}
