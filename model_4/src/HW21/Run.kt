package HW21

/**
 * Усовершенствуем программу так, чтобы нельзя было создать
 * неопределенный тип самолета: сделайте класс Aircraft абстрактным.
 */
fun main() {
//    val aircrafts = Aircraft(757, 1500.0, 1200.0) // Cannot create an instance of an abstract class
    val aircraft: Aircraft = Boeing747(250)
    println(aircraft.info)
}