import java.math.BigInteger as bi

fun main() {
    println(  fact(bi("70000") , bi.ONE)  )

}

tailrec fun fact(x : bi , res :bi = bi.ONE) : bi
{
    if(x==bi.ONE)
        return res
    else
        return fact(x -bi.ONE , x*res)
}