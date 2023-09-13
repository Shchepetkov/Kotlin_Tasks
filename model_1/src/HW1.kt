/**
 * 1. Создайте переменную со значением null типа Any?
 * 2. Переопределите значение ранее созданной переменной на любую цифру
 * 3. Создайте переменную, не указывая её тип и присвойте ей значение
 * из ранее созданной переменной деленную на 2,5
 * 4. Напишите в комментарии какого типа последняя переменная (Double)
 */
fun main() {
    var a: Int? = null
    var b: Any = "3"

    a = 4
    b = 1

    var c = a / 2.5

    checkingDataType(c)
}

fun checkingDataType(x: Any) {
    if (x is String) {
        println("result: $x, type of variable String")
    }
    if (x is Int) {
        println("result: $x, type of variable Int")
    }
    if (x is Double) {
        println("result: $x, type of variable Double")
    }
    if (x is Float) {
        println("result: $x, type of variable Float")
    }
    if (x is Char) {
        println("result: $x, type of variable Char")
    }
    if (x is Byte) {
        println("result: $x, type of variable Byte")
    }
    if (x is Short) {
        println("result: $x, type of variable Short")
    }
    if (x is Long) {
        println("result: $x, type of variable Long")
    }
}
