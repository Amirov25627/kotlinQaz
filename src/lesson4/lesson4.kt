package lesson4


import java.lang.Math.min
import java.lang.Math.pow

fun main() {
//revert(12345)
//println(isPrime(11))
//println(isCoPrime(25, 49))
println(isPalindrome(13341))
//squares()
//buildSumExample()
//average()
}

fun average(){
    val list: List<Int> = listOf(3, 4, 5, 10)
    val sum = list.sum()
    println(sum.toDouble() / list.size)
}


fun buildSumExample(){
    val list: List<Int> = listOf(3, 4, 5, 10)
    val a = list.sum()
    //println(a)
    val str = list.joinToString("+", postfix = "=$a")
    println(str)
}



fun squares(){
    val list = listOf(2, 3, 5)
        for(i in 0 until list.size) {
            println(sqr(list[i]))
        }
}

fun sqr(x:Int): Int {
    var a = x
    a *= a
    return a
}



fun isPalindrome(n: Int): Boolean{
    var result = 1
    var x = n
    var counter = 0
    if (x > 10){
        while (x % 10 != 0) {
            x /= 10
            counter++
        }

        x = n
        var y = 1
        var a = x / pow(10.toDouble(), counter-1.toDouble())
        var b = x.toDouble() % (10.toDouble())
        if (a.toInt() == b.toInt()){
            for (i in 1 .. counter / 2){
                y *= 10
                a = x / pow(10.toDouble(), counter-2.toDouble()) % 10
                b = x.toDouble() % (10.toDouble() * y.toDouble()) / y
                counter--
                println ("a= ${a.toInt()} b= ${b.toInt()}")
                if (a.toInt() == b.toInt()) {result *= 1} else result *= 0
                println("result = $result")
            }
        } else return false

    }
    return result > 0
}





fun isCoPrime(n: Int, m: Int): Boolean{
if (n % 2 == 0 && m % 2 == 0)
    return false

    for(i in 2 .. min(n, m)/2) {
       if (n % i == 0) {
           for (j in 2 .. min(n, m)/2){
               if (m % j == 0) {
                   if (i == j) {return false}
               }
           }
       }

    }
    return true
}




fun isPrime(n: Int): Boolean {
    if (n % 2 == 0){
        return false
    }
    for (i in 3 .. n/2 step 2){
        if (n % i == 0){
            return false
        }
    }
    return true
}

fun revert(n: Int){
    var counter = 1
    var m = n
    while (m / 10 > 0){
        counter++
        m /= 10
    }
    m = n
    var result = 0.0
    for (i in 1 .. counter){
        result += m % 10 * pow(10.toDouble(), (counter - i).toDouble())
        m /= 10
    }
    println(result.toInt())
}