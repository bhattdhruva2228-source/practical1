fun main() {
    val Array1 = arrayOf(10, 90, 60, 80, 100)
    println("\nCreate Array-1 by using arrayOf() method:")
    println(Array1.joinToString())

    val Array2 = Array<Int>(5) { 0 }
    println("\nCreate Array-2 by using Array<>() method:")
    println(Array2.joinToString())

    val Array3 = Array(8) { i -> i }
    println("\nCreate Array-3 by using Array<>() method Lambda function:")
    println(Array3.joinToString())

    val Array4 = IntArray(5) { 0 }
    println("\nCreate Array-4 by using IntArray:")
    println(Array4.joinToString())

    val Array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array-5 by using intArrayOf:")
    println(Array5.joinToString())

    val arr6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )

    println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf():")
    println(arr6.contentDeepToString())

    val a = IntArray(5)

    println("\nPlease enter Array Value:")

    for (i in a.indices) {
        print("a[$i] = ")
        a[i] = readLine()!!.toInt()
    }

    println("\nEntered Array:")
    println(a.joinToString())

    val builtIn = a.sortedArray()

    println("\n****** With Built-in Function ******")
    println("After sorting by built-in function:")
    println(builtIn.joinToString())

    val b = a.copyOf()

    for (i in 0 until b.size - 1) {
        for (j in 0 until b.size - i - 1) {
            if (b[j] > b[j + 1]) {
                val temp = b[j]
                b[j] = b[j + 1]
                b[j + 1] = temp
            }
        }
    }

    println("\n****** Without Built-in Function ******")

    println("Before Sorting:")
    println(a.joinToString())

    println("\nAfter Sorting without built-in function:")
    println(b.joinToString())

    val zeroes = Array<Int>(3) { i -> i * 2 }
    println(zeroes.joinToString())
}