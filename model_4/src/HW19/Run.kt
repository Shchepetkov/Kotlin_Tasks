package HW19

/**
 * Создадим наследника класса Aircraft с названием Boeing747 и добавим ему
 * свойство, обозначающее вместимость пассажиров
 */
fun main() {
    val aircraft = Boeing747(757, 1500.0, 1200.0, 250)
    println(aircraft.info)
}