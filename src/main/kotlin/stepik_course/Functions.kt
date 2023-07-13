package stepik_course

fun main() {
    println(max(5, 10))
    println(str("Antonsfsdfsdfsdf"))
}

fun max(a: Int, b: Int): Int { // после скобок указывается возвращаемый тип метода
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * Можно не указывать возвращаемый тип после скобок и не использовать return
 */
fun str(smthStr: String) = if (smthStr.length > 5) smthStr.substring(0 .. 4) else smthStr