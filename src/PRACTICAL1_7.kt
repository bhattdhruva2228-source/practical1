fun factorial(n: Int): Long {
    return if (n == 0 || n == 1)
        1
    else
        n * factorial(n - 1)
}
fun main() {
    print("Enter a number: ")
    val num = readln().toInt()
    println("Factorial of $num = ${factorial(num)}")
}