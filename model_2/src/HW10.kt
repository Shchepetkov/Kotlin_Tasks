/**
 * Напишите программу для хранения названия городов. Пользователь
 * может сделать 4 действия:
 * 1. Добавить название города в программу.
 * 2. Посмотреть в консоли список всех добавленных городов
 * 3. Посмотреть список добавленных городов без повторений
 * 5. Выход из программы
 * Для хранения используйте коллекцию типа List.
 */
fun main() {
    var listCountry: MutableList<String>? = mutableListOf()
    var exit: Int? = null

    while (exit != 4) {
        println(
            "Меню:" +
                    "\n1. Добавить название города" +
                    "\n2. Посмотреть список всех добавленных городов" +
                    "\n3. Посмотреть список добавленных городов без повторений" +
                    "\n4. Выход из программы"
        )
        print("Ввод: ")
        exit = readLine()?.toIntOrNull()
        when (exit) {
            1 -> {
                print("Введите названия города: ")
                val text = readLine()
                listCountry?.add(text.toString())
            }
            2 -> {
                if (listCountry?.size != 0) {
                    val list = listCountry?.toList()
                    println(list)
                } else {
                    println("Список пустой")
                }
            }
            3 -> {
                val distinct = listCountry?.distinct()?.toList()
                println(distinct)
            }
        }
    }
}