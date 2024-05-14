package tech.aelson.algorithms.search.find_smaller_elements

import tech.aelson.algorithms.model.Grade

class FindSmallerElementsTester {
    static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7)
        Grade[] unsortedGrades = [
                new Grade("andre", 4),
                new Grade("carlos", 8.5),
                new Grade("ana", 10),
                new Grade("jonas", 3),
                new Grade("juliana", 6.7),
                guilherme,
                new Grade("paulo", 9),
                new Grade("mariana", 5),
                new Grade("lucia", 9.3)
        ]

        def lowerValuesCount = FindSmallerElements.execute(guilherme, unsortedGrades)
        println "Lower values count: $lowerValuesCount"
    }
}
