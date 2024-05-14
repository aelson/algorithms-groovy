package tech.aelson.algorithms.sort.selection_sort

import tech.aelson.algorithms.model.Product
import tech.aelson.algorithms.util.Util

class SelectionSortTester {
    static void main(String[] args) {
        Product[] products = Util.getUnsortedProducts()
        Util.printProductsArray("Original array: ", products)

        SelectionSort.execute(products, products.length)
        Util.printProductsArray("Sorted array: ", products)
    }
}
