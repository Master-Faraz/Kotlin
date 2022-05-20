interface A{
    fun show()
}

interface B{
    fun disp()
}

class C :A,B{
    override fun disp() {
        println("Overrided disp function")
    }

    override fun show() {
        println("show function")

    }
}


fun main() {
    val obj = C()
    obj.disp()
    obj.show()
}