fun main(args: Array<String>) {
//    println("Hello World!")

//      creating object of kotlin class
    var c = dummy()
    c.name = "Faraz"
//    println("Name is " + c.name)
//    println("Name is ${c.name}" )

//    Creating object of Java Class

    var x = Java_Class()
    x.num = 555   //  This will call getters of java class
//    println(x.num)



//    Airthmatic Operations
    var a : Int = 5
    var b : Int = 6
    var res = a+b

//    println("The sum of $a and $b is $res")


//    IF Else

//    if(a>b)
//        println(a)
//    else
//        println(b)


//    If else as an expression -->  Returns something

//    var num: Int = if (a>b)
//        a
//    else
//        b
//    println(num)


//    Comparing two strings
    var str1 : String = "Faraz"
    var str2 : String = "faraz"

    if(str1 == str2)
        println("Same")
    else
        println("Not same")


}