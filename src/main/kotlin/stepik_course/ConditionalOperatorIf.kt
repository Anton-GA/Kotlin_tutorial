package stepik_course

fun main() {
    val a = 50
    if (a < 40) {
        println("Меньше 40")
    } else if (a < 60) {
        println("Больше 40, но меньше 60")
    } else {
        println(" Больше либо равно 60")
    }

    //val food: String
    val count = 400
    val food = if (count > 500) {
        "Пицца" // присвоится переменной food
    } else if (count > 200) {
        "Шаурма"
    } else {
        "Доширак"
    }
    println("Вы можете позволить себе купить следующий продукт: $food")
}