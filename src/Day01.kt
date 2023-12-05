fun main() {

    val numForward = hashMapOf<String, Int>("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)
    val numBackward = hashMapOf<String, Int>("eno" to 1, "owt" to 2, "eerht" to 3, "ruof" to 4, "evif" to 5, "xis" to 6, "neves" to 7, "thgie" to 8, "enin" to 9)

    fun indexOfWordNumOneTwoSix(input: String): Any {
        for (index in 0..input.length-3) {
            if (numForward.contains(input.substring(index,index+3))) {
                return listOf(index,input.substring(index,index+3));
            }
        }
        return -1
    }

    fun indexOfWordNumFourFiveNine(input: String): Any {
        for (i in 0..input.length-4) {
            if (numForward.contains(input.substring(i,i+4))) {
                return listOf(i, input.substring(i,i+4))
            }
        }
        return -1
    }

    fun indexOfWordNumThreeSevenEight(input: String): Any {
        for (i in 0..input.length-5) {
            if (numForward.contains(input.substring(i+5))) {
                return listOf(i, input.substring(i,i+5))
            }
        }
        return -1
    }

    fun indexOfWordNumOneTwoSixReversed(input: String): Any {
        for (index in 0..input.length-3) {
            if (numBackward.contains(input.substring(index,index+3))) {
                return listOf(index, input.substring(index,index+3));
            }
        }
        return -1
    }

    fun indexOfWordNumFourFiveNineReversed(input: String): Any {
        for (i in 0..input.length-4) {
            if (numBackward.contains(input.substring(i,i+4))) {
                return listOf(i, input.substring(i,i+4))
            }
        }
        return -1
    }

    fun indexOfWordNumThreeSevenEightReversed(input: String): Any {
        for (i in 0..input.length-5) {
            if (numBackward.contains(input.substring(i+5))) {
                return listOf(i, input.substring(i,i+5))
            }
        }
        return -1
    }


    fun part2(input: List<String>): Int {

        var result = 0

        var num1: Int
        var indexOfNum1 = -1
        var indexOfNum1Word = -1
        var num1Found = false
        var num2: Int
        var indexOfNum2 = -1
        var indexOfNum2Word = -1
        var num2Found = false

        for (element in input) {
            for (index in 0..element.length-1) {
                if (element[index].isDigit()) {
                    num1 = element[index].toInt() * 10
                    indexOfNum1 = index
                    num1Found = true
                    break
                }
            }
            if (!num1Found) {
                for (index in 0..element.length) {
                    var numWord: String
                    if (indexOfWordNumOneTwoSix(element) < indexOfNum1) {
                        numWord =
                        break
                    }
                    if (indexOfWordNumFourFiveNine(element) < indexOfNum1) {
                        indexOfNum1 = indexOfWordNumFourFiveNine(element)
                        break
                    }
                    if (indexOfWordNumThreeSevenEight(element) < indexOfNum1) {
                        indexOfNum1 = indexOfWordNumThreeSevenEight(element)
                        break
                    }
                }

            }


            val reversedString = element.reversed()

            for (index in 0..reversedString.length-1) {
                if (reversedString[index].isDigit()) {
                    num2 = reversedString[index].toInt()
                    indexOfNum2 = index
                    num2Found = true
                    break
                }
            }
            if (!num2Found) {
                for (index in 0..reversedString.length) {
                    if (indexOfWordNumOneTwoSixReversed(element) != -1) {
                        indexOfNum2Word = indexOfWordNumOneTwoSixReversed(element)
                        break
                    }
                    if (indexOfWordNumFourFiveNineReversed(element) != -1) {
                        indexOfNum2Word = indexOfWordNumFourFiveNineReversed(element)
                        break
                    }
                    if (indexOfWordNumThreeSevenEightReversed(element) != -1) {
                        indexOfNum2Word = indexOfWordNumThreeSevenEightReversed(element)
                        break
                    }
                }
                num2 = reversedString[indexOfNum2]
            }




        }

        return input.size
    }



    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")

    val input = readInput("Day01")
    //part2(input).println()
}