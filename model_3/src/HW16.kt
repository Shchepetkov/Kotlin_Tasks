import java.lang.Math.sqrt

/**
 * Напишите функцию для переменных типа Double, возвращающую корень
 * числа
 */
fun main() {
    fun Double.sqrtDouble(number: Double) {
        println(sqrt(number))
    }

    val example = 100.0

    example.sqrtDouble(example)
}