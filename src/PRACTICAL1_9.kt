fun main() {
    val a = arrayListOf(57, 90, 10, 13, 14)
    var max = a[0]
    for (i in a.indices) {
        println("a[$i]=${a[i]}")
        if (a[i] > max) {
            max = a[i]
        }
    }
    println("Largest element =$max")
}
