fun main(){
    println("Enter Number:")
    val num= readln().toInt()
    println(
            if(num%2==0)
                "Even"
            else
                "Odd"
            )
}
