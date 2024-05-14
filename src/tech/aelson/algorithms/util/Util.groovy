package tech.aelson.algorithms.util

import tech.aelson.algorithms.model.Grade
import tech.aelson.algorithms.model.Product

class Util {
    static void swap(Object[] array, int first, int second) {
        println "<-> Swapping element $first with $second"

        def firstElement = array[first]
        def secondElement = array[second]

        println "<-> Swapping object ${firstElement} with ${secondElement}"

        array[first] = secondElement
        array[second] = firstElement

        println "------------------------------------"
    }

    static void printProductsArray(String arrayTitle, Product[] products) {
        println arrayTitle
        products.each { product ->
            println "${product.name} costs ${product.price}"
        }
    }

    static void printGradesArray(String arrayTitle, Grade[] grades) {
        println arrayTitle
        grades.each { grade ->
            println "${grade.studentName} costs ${grade.result}"
        }
    }

    static Product[] getUnsortedProducts() {
        return [
                new Product("Ford Escape", 30000),
                new Product("Toyota Corolla", 20000),
                new Product("Audi Q5", 45000),
                new Product("Honda Civic", 30000),
                new Product("Tesla Model 3", 50000)
        ]
    }

    static Grade[] getUnsortedGrades(Grade specialGrade) {
        return [
                new Grade("andre", 4),
                new Grade("carlos", 8.5),
                new Grade("ana", 10),
                new Grade("jonas", 3),
                new Grade("juliana", 6.7),
                new Grade("lucia", 9.3),
                new Grade("paulo", 9),
                new Grade("mariana", 5),
                specialGrade,
        ]
    }
}
