package HW18

/**
 * Усовершенствуйте программу для авиакомпании.
 *
 * Пусть свойства: номер воздушного судна, максимальная дальность полета
 * и вместимость бака определяются через конструктор. Для этих свойств
 * значения определять не надо.
 */
class Aircraft(_aircraftNumber: Int, _maximumFlightRange: Double, _tankCapacity: Double) {
    var aircraftNumber: Int            //номер воздушного судна

    init {
        aircraftNumber = _aircraftNumber
    }

    var maximumFlightRange: Double    //максимальная дальность полета

    init {
        maximumFlightRange = if (_maximumFlightRange >= 0.0)
            _maximumFlightRange
        else
            5000.0
    }

    var tankCapacity: Double       //вместимость бака

    init {
        tankCapacity = if (_tankCapacity <= 0 && _tankCapacity < 1000)
            _tankCapacity
        else
            1000.0
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
    val boing = Aircraft(757, 1500.0, 1200.0)
    println(boing.info)
}