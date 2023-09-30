import aircraft.AirbusA400M
import aircraft.Aircraft
import aircraft.Boeing747
import aircraft.Y5

/**
 * 1. Создайте в программе для авиакомпании еще пару классов,
 * описывающих различные модели самолетов. Сделайте один из них грузовым,
 * для этого создайте соответствующий интерфейс со свойством грузоподъёмность.
 *
 * 2. В классе main используйте какую либо коллекцию для хранения информации об
 * имеющихся самолетах у авиакомпании. Добавьте в эту
 * коллекцию несколько самолетов используя имеющиеся классы моделей самолетов.
 *
 * 3. Напишите интерфейс для пользователя, где пользователь может в консоли запрашивать
 * информацию о самолетах авиакомпании. Интерфейс
 * должен отображать список команд, а пользователь в свою очередь выбирает номер команды.
 */
fun main() {

    val boeing747: Aircraft = Boeing747(757, 1500.0, 1200.0, 250)
    val airbusA400M: Aircraft = AirbusA400M(400, 1500.0, 1200.0, 15, 5000)
    val y5: Aircraft = Y5(5, 1500.0, 1200.0, 5)

    val listAircraft: MutableMap<Int, Aircraft> =
        mutableMapOf(
            1 to boeing747,
            2 to airbusA400M,
            3 to y5
        )

    var exit: Int? = null

    while (exit != 4) {
        println(
            "Меню:" +
                    "\n1. Узнать какой самолет грузовой" +
                    "\n2. Посмотреть список всех самолетов в компании" +
                    "\n3. Посмотреть полную информацию по конкретному самолету по его номеру в списке" +
                    "\n4. Выход из программы"
        )
        print("Ввод: ")
        exit = readLine()?.toIntOrNull()
        when (exit) {
            1 -> {
                for (i in listAircraft) {
                    if (i.value.loadCapacity is Int) {
                        println(i.value.name)
                    }
                }
            }
            2 -> {
                if (listAircraft.isNotEmpty()) {
                    for (i in listAircraft) {
                        println("${i.key}. ${i.value.name}")
                    }
                } else {
                    println("Список пустой")
                }
            }
            3 -> {
                print("Введите номер самолета по которому хотите получить информацию: ")
                val number = readLine()
                if (listAircraft.containsKey(number!!.toInt())) {
                    println(listAircraft[number.toInt()]?.info)
                } else {
                    println("Самолета с таким номером не существует")
                }

            }
        }
    }
}