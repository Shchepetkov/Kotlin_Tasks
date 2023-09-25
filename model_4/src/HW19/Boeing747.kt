package HW19

import HW22.Aircraft

class Boeing747(_aircraftNumber: Int, _maximumFlightRange: Double, _tankCapacity: Double, _numberOfSeats: Int) :
    Aircraft(_aircraftNumber, _maximumFlightRange, _tankCapacity) {
    var numberOfSeats = 500
        set(value) {
            if (value >= 0)
                field = value
        }

    init {
        numberOfSeats = _numberOfSeats
    }

    override val info: String = "Номер воздушного судна: $aircraftNumber, \n" +
            "максимальная дальность полета: $maximumFlightRange, \n" +
            "вместимость бака: $tankCapacity, \n" +
            "расход топлива на 100 км: $fuelConsumptionPer100km, \n" +
            "вместимость пассажиров: $numberOfSeats"

}