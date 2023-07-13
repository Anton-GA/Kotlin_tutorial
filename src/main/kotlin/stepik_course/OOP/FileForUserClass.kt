package stepik_course.OOP

fun main() {
    val user = User()
    user.setName("Anton")
    user.setAge(24)
    println("Имя: ${user.getName()} Возраст: ${user.getAge()}")
}