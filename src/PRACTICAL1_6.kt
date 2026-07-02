fun main()
{
    var n1= readln().toInt()
    var n2= readln().toInt()
    println(add(n1,n2))
    println(sub(n1,n2))
    println(multiply(n1,n2))
    println(div(n1,n2))
}
fun add(n1: Int, n2: Int): Int{
    return n1 + n2
}
fun sub(n1: Int, n2: Int): Int{
    return n1 - n2
}
 fun multiply(n1: Int, n2: Int): Int{
     return n1 * n2
 }
fun div(n1: Int, n2: Int): Int{
    return n1 / n2
}
