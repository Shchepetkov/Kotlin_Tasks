/**
 * Поможем авиакомпании в создании программы для учета авиапарка.
 *
 * Создайте класс Aircraft и реализуйте в нем свойства, содержащие
 * следующее: номер воздушного судна, максимальная дальность полета,
 * вместимость бака, расход топлива на 100 км. Установите значения по
 * своему усмотрению.
 *
 * Переопределите геттер свойства содержащего расход топлива, чтобы он
 * самостоятельно рассчитывался из свойств дальности полета и
 * вместимости бака.
 */
class Aircraft {
    var aircraftNumber = 777 //номер воздушного судна
    var maximumFlightRange = 5000.0 //максимальная дальность полета
        set(value) {
            if (value >= 0.0)
                field = value
        }
    var tankCapacity = 1000.0 //вместимость бака
        set(value) {
            if ((value <= 0) and (value < 1000))
                field = value
        }
    var fuelConsumptionPer100km = 10.0 //расход топлива на 100 км
        get() {
            return (tankCapacity / maximumFlightRange) * 100.0
        }
    val info: String
        get() = "Номер воздушного судна: $aircraftNumber, " +
                "максимальная дальность полета: $maximumFlightRange, " +
                "вместимость бака: $tankCapacity, " +
                "расход топлива на 100 км: $fuelConsumptionPer100km "
}

fun main() {
    val boing = Aircraft()
    boing.maximumFlightRange = 4000.0
    boing.tankCapacity = 500.0
    println(boing.info)
}