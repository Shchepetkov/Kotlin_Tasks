package HW22

/**
 * 1. Создайте в классе Aircraft функцию для вывода характеристик
 * самолетов в консоль.
 * 2. Переопределите данную функцию в классе Boeing747, так чтобы еще
 * выводилась информация о пассажирах
 * 3. Сделайте свойства обоих классов видимыми только внутри этих
 * классов и их наследниках, кроме свойства наследуемого от
 * интерфейса. Свойства и функции интерфейсов не поддерживают
 * модификатор protected и internal
 */
fun main() {
    val aircraft: Aircraft = Boeing747(757, 1500.0, 1200.0, 250)
    println(aircraft.info)
}