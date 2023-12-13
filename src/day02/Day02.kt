package day02

import println
import readInput
import java.util.*
import kotlin.concurrent.fixedRateTimer

fun main() {
    val NUM_RED_CUBES = 12
    val NUM_GREEN_CUBES = 13
    val NUM_BLUE_CUBES = 14
    var sum = 0
    var lineIndex = 0
    var numRed = 0
    var numBlue = 0
    var numGreen = 0


    fun part1(input: List<String>): Int {
        for (line in input) {
            lineIndex++
            val firstSubstring = line.substring(line.indexOf(":"), line.indexOf(";"))
            if (firstSubstring.indexOf(",") != -1) {
                val firstPortion = firstSubstring.substring(0, firstSubstring.indexOf(","))
                if (firstPortion.contains("red")) {
                    numRed = firstPortion.filter { it.isDigit() }.toInt()
                } else if (firstPortion.contains("green")) {
                    numGreen = firstPortion.filter { it.isDigit() }.toInt()
                } else {
                    numGreen = firstPortion.filter { it.isDigit() }.toInt()
                }
                if (numRed > NUM_RED_CUBES || numGreen > NUM_GREEN_CUBES || numBlue > NUM_BLUE_CUBES) {
                    continue
                }
                if (firstSubstring) {

                }
            }

        }
        return sum
    }

    val input = readInput("codeTest")
    part1(input).println()
}

