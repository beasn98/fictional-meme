package day01

import println
import readInput

fun main() {

    val numForward = hashMapOf<String, Int>("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)
    val numBackward = hashMapOf<String, Int>("eno" to 1, "owt" to 2, "eerht" to 3, "ruof" to 4, "evif" to 5, "xis" to 6, "neves" to 7, "thgie" to 8, "enin" to 9)

    fun part2(input: List<String>): Int {
        var result = 0
        var num1 = 0
        var num2 = 0
        for (element in input) {
            num1 = 0
            num2 = 0
            for (i in 0 until element.length) {
                if (element[i].isDigit()) {
                    num1 = element[i].toString().toInt() * 10
                    break
                }
                if (i+3 < element.length && element.substring(i, i+3) == "one") {
                    num1 = 10
                    break
                }
                if (i+3 < element.length && element.substring(i,i+3) == "two") {
                    num1 = 20
                    break
                }
                if (i+5 < element.length && element.substring(i,i+5) == "three") {
                    num1 = 30
                    break
                }
                if (i+4 < element.length && element.substring(i, i+4) == "four") {
                    num1 = 40
                    break
                }
                if (i+4 < element.length && element.substring(i, i+4) == "five") {
                    num1 = 50
                    break
                }
                if (i+3 < element.length && element.substring(i, i+3) == "six") {
                    num1 = 60
                    break
                }
                if (i+5 < element.length && element.substring(i, i+5) == "seven") {
                    num1 = 70
                    break
                }
                if (i+5 < element.length && element.substring(i, i+5) == "eight") {
                    num1 = 80
                    break
                }
                if (i+4 < element.length && element.substring(i, i+4) == "nine") {
                    num1 = 90
                    break
                }
            }
            //go backwards now
            val elementRev = element.reversed()
            for (i in 0 until elementRev.length) {
                if (elementRev[i].isDigit()) {
                    num2 = elementRev[i].toString().toInt()
                    break
                }
                if (i+3 < elementRev.length && elementRev.substring(i, i+3) == "one".reversed()) {
                    num2 = 1
                    break
                }
                if (i+3 < elementRev.length && elementRev.substring(i,i+3) == "two".reversed()) {
                    num2 = 2
                    break
                }
                if (i+5 < elementRev.length && elementRev.substring(i,i+5) == "three".reversed()) {
                    num2 = 3
                    break
                }
                if (i+4 < elementRev.length && elementRev.substring(i, i+4) == "four".reversed()) {
                    num2 = 4
                    break
                }
                if (i+4 < elementRev.length && elementRev.substring(i, i+4) == "five".reversed()) {
                    num2 = 5
                    break
                }
                if (i+3 < elementRev.length && elementRev.substring(i, i+3) == "six".reversed()) {
                    num2 = 6
                    break
                }
                if (i+5 < elementRev.length && elementRev.substring(i, i+5) == "seven".reversed()) {
                    num2 = 7
                    break
                }
                if (i+5 < elementRev.length && elementRev.substring(i, i+5) == "eight".reversed()) {
                    num2 = 8
                    break
                }
                if (i+4 < elementRev.length && elementRev.substring(i, i+4) == "nine".reversed()) {
                    num2 = 9
                    break
                }
            }
            result += num1 + num2
        }
        return result
    }



    // test if implementation meets criteria from the description, like:

    val input = readInput("code", "day01")
    part2(input).println()
}