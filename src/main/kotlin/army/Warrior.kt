package army//fun army.main() {
//    println("Hello world!")

//    val numberOfOrders: Int = 42 // val - неизменяемая переменная
//
//    var notificationText: String = "Не забудьте маску и перчатки!" // var - изменяемая переменная
//
//    println(numberOfOrders)
//    println(notificationText)

//    val userAge = 42
//    if(userAge >= AGE_OF_MAJORITY) {
//        println("Показать экран со скрытым контентом")
//    }
//    if(userAge < AGE_OF_MAJORITY) {
//        println("Вернуться на главный экран")
//    }
//
//}

//const val AGE_OF_MAJORITY = 18


fun main() {
    var counter = 5

    while (counter > 0) {
        println("Реклама закончится через ${counter--}")
        Thread.sleep(1000)
    }
}