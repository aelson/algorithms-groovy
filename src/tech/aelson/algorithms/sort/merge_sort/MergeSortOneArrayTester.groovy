package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

class MergeSortOneArrayTester {
    static void main(String[] args) {
//        Grade[] sortedHalfOfGrades = [
//                new Grade("mariana", 5),
//                new Grade("carlos", 8.5),
//                new Grade("lucia", 9.3),
//                new Grade("ana", 10),
//                new Grade("jonas", 3),
//                new Grade("andre", 4),
//                new Grade("juliana", 6.7),
//                new Grade("guilherme", 7),
//                new Grade("paulo", 9),
//        ]
        Grade[] unsortedGrades = [
                new Grade("mariana", 5),
                new Grade("ana", 10),
                new Grade("carlos", 8.5),
                new Grade("lucia", 9.3),
                new Grade("andre", 4),
                new Grade("paulo", 9),
                new Grade("juliana", 6.7),
                new Grade("jonas", 3),
                new Grade("guilherme", 7),
        ]
        //Util.printGradesArray("Grades array: ", sortedHalfOfGrades)
        Util.printGradesArray("Grades array: ", unsortedGrades)

        //MergeSort.sortOneArrayWithTwoOrderedHalf(sortedHalfOfGrades, 0, 4, 8)
        MergeSort.mergeSort(unsortedGrades, 0, unsortedGrades.length)
        Util.printGradesArray("Sorted array: ", unsortedGrades)
    }
}
