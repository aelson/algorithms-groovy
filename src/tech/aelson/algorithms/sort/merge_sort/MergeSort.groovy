package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade

class MergeSort {
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
        while (currentOfFirstArray < firstArray.length) {
            println "-> Inserting ${firstArray[currentOfFirstArray].studentName} (${firstArray[currentOfFirstArray].result}) on the position $currentOfMerged because it is left over from the first array"
            merged[currentOfMerged] = firstArray[currentOfFirstArray]
            currentOfFirstArray++
            currentOfMerged++
        }
        while (currentOfSecondArray < secondArray.length) {
            println "-> Inserting ${secondArray[currentOfSecondArray].studentName} (${secondArray[currentOfSecondArray].result}) on the position $currentOfMerged because it is left over from the second array"
            merged[currentOfMerged] = secondArray[currentOfSecondArray]
            currentOfSecondArray++
            currentOfMerged++
        }
        return merged
    }

    static Grade[] sortOneArray(Grade[] array, int start, int middle, int end) {
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
        while (firstPartIndex < middle) {
            println "-> Inserting ${array[firstPartIndex].studentName} (${array[firstPartIndex].result}) on the position $sortedIndex because it is left over from the first part of the array"
            sorted[sortedIndex] = array[firstPartIndex]
            firstPartIndex++
            sortedIndex++
        }
        while (secondPartIndex < end) {
            println "-> Inserting ${array[secondPartIndex].studentName} (${array[secondPartIndex].result}) on the position $sortedIndex because it is left over from the second part of the array"
            sorted[sortedIndex] = array[secondPartIndex]
            secondPartIndex++
            sortedIndex++
        }
        if (start > 0) {
            println "Rebuilding the original array keeping the initial object(s) not ordered (because the start is greater than 0)"
            (0..<sortedIndex).each { indexOfMerged ->
                println "-> Inserting ${sorted[indexOfMerged].studentName} (${sorted[indexOfMerged].result}) on the position ${start + indexOfMerged}"
                array[start + indexOfMerged] = sorted[indexOfMerged]
            }
        }
        return array
    }

}
