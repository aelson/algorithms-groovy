package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

class MergeSortTwoArraysTester {
    static void main(String[] args) {
        Grade[] firstArray = [
                new Grade("andre", 4),
                new Grade("mariana", 5),
                new Grade("carlos", 8.5),
                new Grade("paulo", 9)
        ]

        Grade[] secondArray = [
                new Grade("jonas", 3),
                new Grade("juliana", 6.7),
                new Grade("guilherme", 7),
                new Grade("lucia", 9.3),
                new Grade("ana", 10)
        ]
        Util.printGradesArray("First array: ", firstArray)
        Util.printGradesArray("Second array: ", secondArray)

        def rank = MergeSort.mergeTwoArrays(firstArray, secondArray)
        Util.printGradesArray("Merged array: ", rank)
    }
}
