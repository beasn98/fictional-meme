package day02

import println
import readInput
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.math.max

fun main() {



    fun part1(input: List<String>): Int {
        val NUM_RED_CUBES = 12
        val NUM_GREEN_CUBES = 13
        val NUM_BLUE_CUBES = 14
        var strInfo: List<String>
        var sum = 0
        var lineIndex = 0
        var numRed = 0
        var numBlue = 0
        var numGreen = 0

        var stop: Boolean

        for (line in input) { //each game
            stop = false
            lineIndex++
            strInfo = line.substring(line.indexOf(": ")+1).split(";")
            for (element in strInfo) { // all pulls
                val elementSplit = element.split(", ")
                //println(elementSplit)
                for (color in elementSplit) { //rgb of each pull
                    numRed = 0; numGreen = 0; numBlue = 0
                    //println(color)
                    if (color.contains("red")) {
                        numRed = color.filter { it.isDigit() }.toInt()
                    } else if (color.contains("green")) {
                        numGreen = color.filter { it.isDigit() }.toInt()
                    } else {
                        numBlue = color.filter { it.isDigit() }.toInt()
                    }
                    if (numRed > NUM_RED_CUBES || numGreen > NUM_GREEN_CUBES || numBlue > NUM_BLUE_CUBES) {
                        stop = true
                        break
                    }
                }
                if (stop) {
                    break
                }
            }
            if (stop) {
                continue
            }
            //println(lineIndex)
            sum += lineIndex
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var powerOfSet = 0
        for (line in input) { //each game
            var numRed: Int; var numBlue: Int; var numGreen: Int
            var maxRed = 0; var maxBlue = 0; var maxGreen = 0
            var strInfo = line.substring(line.indexOf(": ")+1).split(";")
            for (element in strInfo) { // all pulls
                val elementSplit = element.split(", ")
                //println(elementSplit)
                for (color in elementSplit) { //rgb of each pull
                    //println(color)
                    if (color.contains("red")) {
                        numRed = color.filter { it.isDigit() }.toInt()
                        maxRed = max(numRed, maxRed)
                    } else if (color.contains("green")) {
                        numGreen = color.filter { it.isDigit() }.toInt()
                        maxGreen = max(numGreen, maxGreen)
                    } else {
                        numBlue = color.filter { it.isDigit() }.toInt()
                        maxBlue = max(numBlue, maxBlue)
                    }
                }
            }
            powerOfSet += maxRed * maxBlue * maxGreen
        }
        return powerOfSet
    }


    val input = readInput("code", "day02")
    part2(input).println()
}

