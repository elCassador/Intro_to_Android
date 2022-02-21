import java.util.*
import kotlin.math.sign

fun main() {
    println(evenOrOdd(10))
    println(evenOrOddMultiply(15))
    println(toMinus(13))
    println(defineCentury(2465).toString() + " Century")
    println(minValue(arrayOf(34, 15, 88, 2)))
    println(findTwoMaxValue(listOf(1, 5, 87, 45, 8, 8)))
    println(maxPositiveAndSumNegative(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
    println(countVowelLetters("abcdefg"))
    println(findMedSymbol("student"))
    multipleTable(3)
}

fun evenOrOdd(intNumValue: Int) : String {
    if (intNumValue % 2 == 0) {
        return "even"
    }
    else {
        return "odd"
    }
}

fun evenOrOddMultiply(intNumValue: Int): Int {
    if (intNumValue % 2 == 0) {
        return intNumValue * 4
    }
    else {
        return intNumValue * 5
    }
}

fun toMinus(intNumValue: Int): Int {
    return intNumValue * -1
}

fun defineCentury(yearValue: Int): Int {
    return (yearValue / 100) + 1
}

fun minValue(list: Array<Int>): Int? {
    return list.minOrNull()
}

fun findTwoMaxValue(list: List<Int>): List<Int> {
    val length = list.size
    val sortedList = list.sorted()
    return listOf(sortedList[length - 2], sortedList[length - 1])
}

fun maxPositiveAndSumNegative(list: List<Int>): List<Int?> {
    var negativeSum = 0
    val maxPositive = list.maxOrNull()
    for (i in list) {
        if (i.sign == -1) {
            negativeSum += i
        }
    }
    return listOf(maxPositive, negativeSum)
}

fun countVowelLetters(inputString: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var vowelsCounter = 0
    for (letter in inputString) {
        if (vowels.contains(letter)) {
            vowelsCounter += 1
        }
    }
    return vowelsCounter
}

fun findMedSymbol(inputString: String): String {
    val length = inputString.length
    var medianValue = ""
    if (evenOrOdd(length).equals("even")) {
        medianValue += inputString[length / 2 - 1]
        medianValue += inputString[length / 2]
    }
    else {
        medianValue += inputString[length / 2]
    }
    return medianValue
}

fun multipleTable(dimension: Int) {
    var multiplicationTable: Array<Array<Int>> = Array(dimension, { Array(dimension, {0}) })
    for (i in 0 until dimension) {
        for (j in 0 until dimension) {
            multiplicationTable[i][j] = (i + 1) * (j + 1)
        }
    }
    for (i in multiplicationTable) {
        println()
        for (j in i) {
            print(j.toString().plus(" "))
        }
    }
}