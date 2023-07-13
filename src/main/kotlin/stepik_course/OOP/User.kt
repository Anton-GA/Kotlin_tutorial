package stepik_course.OOP

class User {
    private var age: Int = 0
    private var name: String? = null

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge() = age

    fun setName(name: String?) {
        this.name = name
    }

    fun getName() = name
}