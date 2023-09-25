package HW22

abstract class Aircraft(_aircraftNumber: Int, _maximumFlightRange: Double, _tankCapacity: Double) {
    protected var aircraftNumber: Int            //номер воздушного судна

    init {
        aircraftNumber = _aircraftNumber
    }

    protected var maximumFlightRange: Double    //максимальная дальность полета

    init {
        maximumFlightRange = if (_maximumFlightRange >= 0.0)
            _maximumFlightRange
        else
            5000.0
    }

    protected var tankCapacity: Double       //вместимость бака

    init {
        tankCapacity = if (_tankCapacity <= 0 && _tankCapacity < 1000)
            _tankCapacity
        else
            1000.0
    }

    protected var fuelConsumptionPer100km = 10.0 //расход топлива на 100 км
        get() {
            return (tankCapacity / maximumFlightRange) * 100.0
        }
    open val info: String
        get() = "Номер воздушного судна: $aircraftNumber, " +
                "максимальная дальность полета: $maximumFlightRange, " +
                "вместимость бака: $tankCapacity, " +
                "расход топлива на 100 км: $fuelConsumptionPer100km "
}