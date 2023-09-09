/**
 * 1. Преобразуйте в String, Byte, Short, Int, Double, Float, Long
 */
fun main() {
    var five: Char = '5'

    checkingDataType(five.toString())
    checkingDataType(five.toByte())
    checkingDataType(five.toShort())
    checkingDataType(five.toInt())
    checkingDataType(five.toDouble())
    checkingDataType(five.toFloat())
    checkingDataType(five.toLong())
}