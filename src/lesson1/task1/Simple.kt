@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.sqrt

fun main() {
    val number = 478
    //val minutesDepart = 25
    //val hoursArrive = 13
    //val minutesArrive = 1
    //val sqrX = sqr(x)
    println("result: ${numberRevert(number)}")
}

/**
Бүтін санның квадратын табу
 */
fun sqr(number: Int):Int {
    var result:Int = number * number
    return result
}

/**
Бүтін емес санның квадратын табу
 */
fun sqr(x: Double): Double {
    return x * x
}

/**
Дискриминант шығару
 */
fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

/**
Квадраттық теңдеудің бір жауабын табу
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double): Double {
    return (-1*b - sqrt(discriminant(a, b, c)))/2 * a
}

/**
Квадраттық теңдеудің екі жауабының көбейтіндісін табу
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    TODO()
}

/**
 * Оңай
 *
 * Инпут сағат және минутпен беріледі, мысалы(8:20:35)
 * Қанша секунд екенін шығару(мына мысалда 30035).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    return hours * 3600 + minutes * 60 + seconds
}


/**
 * Оңай
 *
 * Инпут бұрыштың градусы бүтін сандармен беріледі (мысалы, 36 градус 14 минут 35 секунд).
 * Радианмен шығарып беру (мысалы, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {
    val x = (min.toDouble() + sec.toDouble() / 60.0) / 60.0
    return (deg.toDouble() + x) * Math.PI / 180
}

/**
 * Оңай
 *
 * Екі нүктенің координадатасы берілген, ара қашықтығын табыңыз (x1, y1) және (x2, y2).
 * Мысалы, (3, 0) және (0, 4) нүктесінің арасы 5-ке тең
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val x:Double = sqr(x2 - x1)
    val y:Double = sqr(y2 - y1)
    return sqrt(x + y)
}

/**
 * Орташа
 *
 * Инпут 100-ден үлкен кез-келген сан (мысалы, 3801).
 * Соңынан санағанда үшінші санды табу (мына мысалда 8).
 */
fun thirdDigit(number: Int): Int{
    val x:Int = number / 100
    return x % 10
}

/**
 * Орташа
 *
 * Поезд h1 сағат m1 минутта А қаласынан шықты (мысалы в 9:25) және
 * Б қаласына тура сол күннің h2 сағат m2 минутында келді (мысалы в 13:01).
 * Қанша уақыт жүргенін минуттап есептеңіз (мына мысалда 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val x1:Int = (hoursDepart * 60) + minutesDepart
    val x2:Int = (hoursArrive * 60) + minutesArrive
    return x2-x1
}


/**
 * Орташа
 *
 * Инпут үш таңбалы бүтін сан (мысалы, 478).
 * Керісінше етіп қайтару керек (мысалы, 874).
 */
fun numberRevert(number: Int): Int {
    val x1:Int = number / 100
    val x2:Int = (number / 10) % 10
    val x3:Int = number % 10
    return x3*100 + x2*10 + x1
}
