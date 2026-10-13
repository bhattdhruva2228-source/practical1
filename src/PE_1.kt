fun main(){
    var a: Int = 10
    var b: Int = 20

    println("With using Third Variable:")
    println("Before Swapping:")
    println("The value of a is:$a and Value of B is:$b")

    var temp = a
    a = b
    b = temp
    println("After Swapping:")
    println("The value of a is:$a and Value of B is:$b")

    var c: Int = 10
    var d: Int = 20

    println("Without using Third Variable:")
    println("Before Swapping:")
    println("The value of c is:$c and d is:$d")

    c = c+d
    d = c-d
    c = c-d

    println("After Swapping:")
    println("The value of c is:$c and d is:$d")
}
