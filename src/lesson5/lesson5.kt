package lesson5

import kotlin.math.abs

fun main(){
    //val list = mutableListOf(-1, 3, 5, -7)
    //val list = mutableListOf(3, 5, 8, 2)
    //println(resultList)
    //val resultList:List<Double> = center(list)
    //val resultList:List<Int> = negativeList(list)
    //println(negativeList(list))
    //println(absolute(list))
    //println(buildMultplicationExample(list))
    buildMultplicationExample()
}

fun center(list: MutableList<Int>) = list.map{ it - list.sum()/list.size.toDouble()}

fun negativeList(list: List<Int>) = list.filter { it < 0 }

fun absolute(list: MutableList<Int>) = list.map{ abs(it) }

fun buildMultplicationExample() {
    val list = listOf(3, 4, 5, 10)
    var result = 1
    for (i in 0..list.size-1) result *= list[i]
    val str = list.joinToString("*", postfix = "=$result")
    println(str)
}