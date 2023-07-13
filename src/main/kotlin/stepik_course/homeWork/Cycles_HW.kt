package stepik_course.homeWork

/**
 * 1) Создать массив чисел от 300 до 600
 * 2) Вывести на экран в порядке убывания все значения массива, которые без остатка делятся на 5
 */

fun main() {
    val array = arrayOfNulls<Int?>(301)
    for ((index, i) in (300 .. 600).withIndex()) {
        array[index] = i
    }
    for (i in array.size - 1 downTo 0 step 5) {
        println(array[i])
    }
}