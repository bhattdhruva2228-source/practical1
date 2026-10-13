fun main(){ val a= 222
    val b= 111

    val Addition=add(a,b)
    println("Addition:$Addition")
    val Subtraction=subtract(a,b)
    println("Subtraction:$Subtraction")
    val Multiplication=multiply(a,b)
    println("Multiplication:$Multiplication")
    val Division=divide(a,b)
    println("Division:$Division")
}

fun add(a:Int,b:Int): Int{ return a+b
}
fun subtract(a:Int,b:Int):Int{ return a-b
}
fun multiply(a:Int,b:Int):Int{ return a*b
}
fun divide(a:Int,b:Int):Int{ return a/b
}
