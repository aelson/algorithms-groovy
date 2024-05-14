package tech.aelson.algorithms.search

import tech.aelson.algorithms.model.Product

class SearchSmallest {
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
