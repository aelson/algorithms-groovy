package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

class FindSmallerElementsTester {
    static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7)
        Grade[] unsortedGrades = Util.getUnsortedGrades(guilherme)

        def lowerValuesCount = FindSmallerElements.execute(guilherme, unsortedGrades)
        println "Lower values count: $lowerValuesCount"
    }
}
