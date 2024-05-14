package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade

class FindSmallerElements {
    static int execute(Grade reference, Grade[] unsortedGradle) {
        def lowerValuesCount = 0
        unsortedGradle.each { grade ->
            if (grade.result < reference.result) {
                lowerValuesCount++
            }
        }
        return lowerValuesCount
    }
}
