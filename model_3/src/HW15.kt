/**
 * Создайте переменную, которая содержит лямбда выражение для вывода в
 * консоль данных массива типа String.
 */
fun main() {
    val name = arrayOf("Вася", "Петя", "Коля")
    val lambda = { array: Array<String> ->
        for (i in name) {
            println(i)
        }
    }
    lambda(name)
}