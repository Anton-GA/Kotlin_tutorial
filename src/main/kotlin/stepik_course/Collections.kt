package stepik_course

/**
 * Если хотим положить в массив null, то у массива необходимо явно указать тип
 */
fun main() {
//    val array: Array<Int> = arrayOf(1, 2, 5, 10, 25)
//    println(array[4])

    /**
     * В List нельзя добавить новый элемент или удалить элемент (так же в set и map). Эти коллекции являются неизменяемыми
     * Чтобы такие коллекции стали изменяемыми необходимо использовать интерфейсы с приставкой Mutable (изменяемая) у коллекции
     * К эллементам коллекции можно обращаться, как к элементам массива через []
     */
    val listOfNumbers: MutableList<Int> = ArrayList()
    listOfNumbers.add(5)
    println(listOfNumbers.get(0)) //или просто listOfNumber[0]
}