fun main(args: Array<String>) {
    var str : String = ""
    var num = 1

    str = when(num)
    {
        1->"Faraz Ali Ahmad "
        2->"Adam"
        3->"Aatif"
        else -> "-_-"
    }
//    println(str)



//    **************************************************************************************************

//    Loop in kotlin
    var x = 1..10    // It is range type of variable
    var y = 5..6

    for(a in x step 1)
        println(a)




    var x1 = 10 downTo 1    // IN reverse order

    for(a in x1 step 2)
        println(a)

}