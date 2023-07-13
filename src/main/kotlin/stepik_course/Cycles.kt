package stepik_course

fun main() {
    val array = arrayOfNulls<Int>(101)
    for (i in 0 until array.size) {
        array[i] = i
    }
    for(i in array) {
        println(i)
    }

    /**
     * Если хотим идти вниз по массиву (downTo)
     * Мы можем указать шаг (step 2) и тогда будет браться каждый 2-ой элемент
     */
    for (i in 100 downTo 0 step 2) {
        println(i)
    }

    /**
     * В Котлин в цикле forEach можно записывать данные (в отличие от Java)

     * Если в нижнем цикле i != null, то i умножится на 2. Если i == null, то ничего не произойдет
     */

    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)
    }

    for (i in array) {
        println(i)
    }

}