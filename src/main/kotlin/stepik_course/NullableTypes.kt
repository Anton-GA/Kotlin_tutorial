package stepik_course

import org.jetbrains.annotations.Nullable

/**
 *В Котлин нельзя объявлять типы null (компилятор будет подсвечивать как ошибку)
 * Но если все же хотим присвоить null, то это надо явно указать (ставится знак ? после типа)
 */

private var name: String? = null

fun main() {
    val length = name?.length?:0 // если name == null, то выведется 0 (имя?:значение - называется оператор элвис)
    println(name?.length) // знак ? после name используется как проверка на null (в Java это делается с помощью if...else)
//указав ? после имени переменной, можно вызвать метод, например, length (такой способ явялется безопасным)

    val str1: String? = null
    val str2: String? = "42342"
    val str3: String? = ""

    val result = (str1?.length?:0) + (str2?.length?:0) + (str3?.length?:0)
    println(result)
}


