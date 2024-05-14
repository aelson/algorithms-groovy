package tech.aelson.algorithms.sort.quick_sort

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.search.pivot.Pivot

class QuickSort {
    static void execute(Grade[] grades, int start, int end) {
        println "Executing for $start - $end"
        def numberOfElements = end - start
        if (numberOfElements > 1) {
            def pivotIndex = Pivot.execute(grades, end)
            execute(grades, start, pivotIndex)
            execute(grades, pivotIndex + 1, end)
        }
    }
}
