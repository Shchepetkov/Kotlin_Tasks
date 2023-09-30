package aircraft

import interfaces.Cargo
import interfaces.Passenger

//Грузовой
class AirbusA400M(
    _aircraftNumber: Int,
    _maximumFlightRange: Double,
    _tankCapacity: Double,
    _numberOfSeats: Int,
    _loadCapacity: Int
) :
    Aircraft(_aircraftNumber, _maximumFlightRange, _tankCapacity), Passenger, Cargo {

    override val name: String = "AirbusA400M"

    private val numberOfSeats: Int

    private val load: Int

    init {
        numberOfSeats = numberOfSeats(_numberOfSeats)
        load = loadCapacity(_loadCapacity)
    }

    override fun numberOfSeats(value: Int): Int {
        return if (value >= 0)
            value
        else
            0
    }

    override fun loadCapacity(value: Int): Int {
        return if (value < 0) {
            println("Груз не может быть отрицательным - груз отсутствует и он равен 0")
            0
        } else if (value >= 10000) {
            println("Максимальная грузоподьемность равна 10 000 кг. - груз помещен только на 10 000 кг.")
            10000
        } else {
            value
        }
    }

    override val info: String = "Номер воздушного судна: $aircraftNumber, \n" +
            "максимальная дальность полета: $maximumFlightRange, \n" +
            "вместимость бака: $tankCapacity, \n" +
            "расход топлива на 100 км: $fuelConsumptionPer100km, \n" +
            "в килограмном эквиваленте сколько на борту груза: $load, \n" +
            "вместимость пассажиров: $numberOfSeats"

    override val loadCapacity: Any = load
}