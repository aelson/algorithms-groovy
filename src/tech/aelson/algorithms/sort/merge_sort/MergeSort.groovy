package tech.aelson.algorithms.sort.merge_sort

import tech.aelson.algorithms.model.Grade

class MergeSort {
    static Grade[] execute(Grade[] firstArray, Grade[] secondArray) {
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
}
