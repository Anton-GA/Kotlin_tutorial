package stepik_course

//fun main() {

    /**
     * В Котлин не надо использовать брейк, т.к. после выполнения блока кода произойдет
     * автоматический выход из этого блока
     */

    /**
     * Вместо перечисления месяцев можно использовать диапазон
     * in 3..5
     */
//    val indexOfMonth = 4
////    val season: String
//    val season = when(indexOfMonth) {
//        12, 1, 2 -> {
//            "Зима"
//        }
//        3, 4, 5 -> {
//            "Весна"
//        }
//        6, 7, 8 -> {
//            "Лето"
//        }
//        9, 10, 11 -> {
//            "Осень"
//        }
//        else -> {
//            "Не найдено!"
//        }
//    }
//    println(season)
//}

//    fun main() {
//        val temperature = 100
////        val state = if (temperature == 500) {
////            "Газообразное"
////        } else if (temperature == -100) {
////            "Твердое"
////        } else {
////            "Жидкое"
////        }
////        println(state)
//
//        val state = when {
//            temperature < 0 -> "Твердое"
//            temperature < 100 -> "Жидкое"
//            else -> "Газообразное"
//        }
//        println(state)
//    }

    fun main() {
        val currentTime = 23
        val weatherIsGood = true
        val result = when {
            currentTime in 6..22 && weatherIsGood -> {
                "Идем гулять"
            }
            currentTime in 6..22 && !weatherIsGood -> {
                "Читаем книгу"
            }
            else -> "Спать"
        }
        println(result)
    }