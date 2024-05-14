package tech.aelson.algorithms.search.find_smallest

import tech.aelson.algorithms.model.Product

class FindSmallest {
    static int execute(Product[] products, int start, int end) {
        def smallest = start
        (start..end).each {
            if (products[it].price < products[smallest].price) {
                smallest = it
            }
        }
        smallest
    }
}
