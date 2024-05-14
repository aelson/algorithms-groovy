package tech.aelson.algorithms.sort.quick_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.util.Util

class QuickSortTester {
    static void main(String[] args) {
        def guilherme = new Grade("guilherme", 7)
        def unsortedGrades = Util.getUnsortedGrades(guilherme)

        QuickSort.execute(unsortedGrades, 0, unsortedGrades.length)
        Util.printGradesArray("Sorted array: ", unsortedGrades)
    }
}
