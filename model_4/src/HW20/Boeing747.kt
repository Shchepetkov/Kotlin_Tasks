package HW20

import HW22.Aircraft
import HW22.Passenger

class Boeing747(_aircraftNumber: Int, _maximumFlightRange: Double, _tankCapacity: Double, _numberOfSeats: Int) :
    Aircraft(_aircraftNumber, _maximumFlightRange, _tankCapacity), Passenger {
    val numberOfSeats: Int

    init {
        numberOfSeats = numberOfSeats(_numberOfSeats)
    }

    override fun numberOfSeats(value: Int): Int {
        return if (value >= 0)
            value
        else
            0
    }

    override val info: String = "Номер воздушного судна: $aircraftNumber, \n" +
            "максимальная дальность полета: $maximumFlightRange, \n" +
            "вместимость бака: $tankCapacity, \n" +
            "расход топлива на 100 км: $fuelConsumptionPer100km, \n" +
            "вместимость пассажиров: $numberOfSeats"
}