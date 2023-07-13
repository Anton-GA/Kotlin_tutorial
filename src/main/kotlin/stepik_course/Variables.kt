package stepik_course

/**
Если у переменной явно объявить значение нужного типа, то тип можно не указывать

val - неизменяемые переменные (как final в Java). В Котлин есть правило - всегда (по возможности) при создании
 переменной объявлять ее как val

 В Kotlin нет примитивных типов (int, float, char и т.п.). Все типы - ссылочные

 Соединять строки через "+" не рекомендуется (но можно)
 */

fun main() {
    val name = "Anton"
    val surname: String
    val age: Int
    val sex = "Male"
    surname = "Gorbatov"
    age = 24
    println("$name $surname $age $sex")
}