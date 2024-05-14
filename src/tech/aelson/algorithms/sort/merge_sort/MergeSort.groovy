package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade

class MergeSort {
    static void mergeSort(Grade[] grades, int start, int end) {
        def numberOfElements = end - start
        if (numberOfElements > 1) {
            int middle = (int) ((start + end) / 2)
            mergeSort(grades, start, middle)
            mergeSort(grades, middle, end)
            sortOneArrayWithTwoOrderedHalf(grades, start, middle, end)
        }
    }

    static Grade[] mergeTwoArrays(Grade[] firstArray, Grade[] secondArray) {
        def total = firstArray.length + secondArray.length
        def merged = new Grade[total]
        def currentOfFirstArray = 0
        def currentOfSecondArray = 0
        def currentOfMerged = 0
        while (currentOfFirstArray < firstArray.length && currentOfSecondArray < secondArray.length) {
            def grade1 = firstArray[currentOfFirstArray]
            def grade2 = secondArray[currentOfSecondArray]

            println "Comparing ${grade1.studentName} (${grade1.result}) with ${grade2.studentName} (${grade2.result})"

            if (grade1.result < grade2.result) {
                println "-> Inserting ${grade1.studentName} (${grade1.result}) on the position $currentOfMerged"
                merged[currentOfMerged] = grade1
                currentOfFirstArray++
            } else {
                println "-> Inserting ${grade2.studentName} (${grade2.result}) on the position $currentOfMerged"
                merged[currentOfMerged] = grade2
                currentOfSecondArray++
            }
            println "------------------------------------"
            currentOfMerged++
        }
        currentOfMerged = addRemainingElementsToEndOfArray(firstArray, firstArray.length, currentOfFirstArray, merged, currentOfMerged)
        addRemainingElementsToEndOfArray(secondArray, secondArray.length, currentOfSecondArray, merged, currentOfMerged)
        return merged
    }

    static sortOneArrayWithTwoOrderedHalf(Grade[] array, int start, int middle, int end) {
        def total = array.length
        def sorted = new Grade[total - start]
        def sortedIndex = 0
        def firstPartIndex = start
        def secondPartIndex = middle
        while (firstPartIndex < middle && secondPartIndex < end) {
            println "Comparing ${array[firstPartIndex].studentName} (${array[firstPartIndex].result}) with ${array[secondPartIndex].studentName} (${array[secondPartIndex].result})"

            if (array[firstPartIndex].result < array[secondPartIndex].result) {
                println "-> Inserting ${array[firstPartIndex].studentName} (${array[firstPartIndex].result}) on the position $sortedIndex"
                sorted[sortedIndex] = array[firstPartIndex]
                firstPartIndex++
            } else {
                println "-> Inserting ${array[secondPartIndex].studentName} (${array[secondPartIndex].result}) on the position $sortedIndex"
                sorted[sortedIndex] = array[secondPartIndex]
                secondPartIndex++
            }
            println "------------------------------------"
            sortedIndex++
        }
        sortedIndex = addRemainingElementsToEndOfArray(array, middle, firstPartIndex, sorted, sortedIndex)
        addRemainingElementsToEndOfArray(array, end, secondPartIndex, sorted, sortedIndex)
        rebuildArray(array, start, sortedIndex, sorted)
    }

    private static int addRemainingElementsToEndOfArray(Grade[] array, int arrayEnd, int arrayIndex, Grade[] merged, int mergedArrayIndex) {
        while (arrayIndex < arrayEnd) {
            println "-> Inserting ${array[arrayIndex].studentName} (${array[arrayIndex].result}) on the position $mergedArrayIndex because it is left over from the first array"
            merged[mergedArrayIndex] = array[arrayIndex]
            arrayIndex++
            mergedArrayIndex++
        }
        return mergedArrayIndex
    }

    private static void rebuildArray(Grade[] array, int start, int sortedIndex, Grade[] sorted) {
        println "Rebuilding the original array"
        (0..<sortedIndex).each { indexOfMerged ->
            println "-> Inserting ${sorted[indexOfMerged].studentName} (${sorted[indexOfMerged].result}) on the position ${start + indexOfMerged}"
            array[start + indexOfMerged] = sorted[indexOfMerged]
        }
    }
}
