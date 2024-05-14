package tech.aelson.algorithms.search

import tech.aelson.algorithms.model.Product

class SearchSmallest {
    static int findSmallest(Product[] products, int start, int end) {
        def smallest = start
        for (int atual = start; atual <= end; atual++) {
            if (products[atual].price < products[smallest].price) {
                smallest = atual
            }
        }
        return smallest
    }
}
