package HW21

class Boeing747(_numberOfSeats: Int) : Aircraft(747, 5000.0, 1000.0), Passenger {
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