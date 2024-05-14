package tech.aelson.algorithms.search.pivot

import tech.aelson.algorithms.model.Grade

class Pivot {
    static int execute(Grade[] grades, int start, int end) {
        Grade pivot = grades[end - 1]
        int lowerValuesCount = 0
        (0..<end - 1).each { index ->
            Grade current = grades[index]
            if (current.result <= pivot.result) {
                swap(grades, index, lowerValuesCount)
                lowerValuesCount++
            }
        }
        swap(grades, end - 1, lowerValuesCount)
        return lowerValuesCount
    }

    private static void swap(Grade[] grades, int from, int to) {
        Grade grade1 = grades[from]
        Grade grade2 = grades[to]
        grades[to] = grade1
        grades[from] = grade2
    }
}
