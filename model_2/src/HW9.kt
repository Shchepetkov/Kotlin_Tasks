/**
 * Создайте многомерный массив, где в первом массиве хранится названия
 * каких-либо стран, в следующем столицы данных стран и в последнем
 * массиве используемая денежная единица.
 *
 * Сохраните информацию минимум по 3 странам и выведите в консоль в
 * виде:
 * Страна Столица Валюта
 */
fun main() {

    val arr = arrayOf(
        arrayOf("Россия", "США", "Китай"),
        arrayOf("Москва", "Вашингтон", "Пекин"),
        arrayOf("Российский рубль", "Доллар США", "Юань")
    )

    for (i in 0..2) {
        var temp = ""
        for (j in 0..2) {
            temp += "${arr[j][i]} "
        }
        println(temp)
    }
}