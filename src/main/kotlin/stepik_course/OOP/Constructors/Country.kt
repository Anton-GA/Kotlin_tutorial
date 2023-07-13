package stepik_course.OOP.Constructors

/**
 * В Kotlin есть два вида конструкторов: первичный (primary) - создается сразу при создании класса
 * и вторичный (secondary)
 */

class Country(var name: String, var population: Long) { //это primary конструктор
    constructor(): this("", 0) // это вторичный конструктор
}