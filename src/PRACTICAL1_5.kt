fun main()
{
    var monthnumbers= readln().toInt()
    println(
        when(monthnumbers){
            1->"january"
            2->"february"
            3->"march"
            4->"april"
            5->"may"
            6->"jun"
            7->"july"
            8->"august"
            9->"september"
            10->"october"
            11->"november"
            12->"december"
            else->"please enter proper month number"
        }
    )

}