/**
 * Напишите функцию, которая получает в параметры какой-либо год,
 * проверяет високосный ли это год и возвращает результат проверки.
 */
fun main() {
    print("Введите год: ")
    val year: Int = readLine()?.toIntOrNull()!!

    if (leapYear(year)) {
        print("Год високосный.")
    } else {
        print("Год не високосный.")
    }
}

fun leapYear(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}
