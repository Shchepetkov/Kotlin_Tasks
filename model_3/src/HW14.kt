/**
 * Напишите функцию, которая выводит в консоль информацию сотрудника
 * (ФИО, Возраст, Должность и Семейное положение). С помощью
 * перезагрузки функции, сделайте варианты, когда известны только:
 * 1. ФИО и Должность
 * 2. ФИО, Возраст и Должность
 * 3. ФИО, Семейное положение и Должность
 * 4. ФИО, Возраст, Семейное положение и Должность
 */
fun main() {
    infoWorker("Зенков Василий Владимирович", "Разработчик")
    infoWorker("Зенков Василий Владимирович", 30, "Разработчик")
    infoWorker("Зенков Василий Владимирович", "Женат", "Разработчик")
    infoWorker("Зенков Василий Владимирович", 30, "Женат", "Разработчик")

}

fun infoWorker(fullName: String, position: String) = println("ФИО: $fullName, Должность: $position")

fun infoWorker(fullName: String, age: Int, position: String) =
    println("ФИО: $fullName, Возраст: $age, Должность: $position")

fun infoWorker(fullName: String, maritalStatus: String, position: String) =
    println("ФИО: $fullName, Семейное положение: $maritalStatus, Должность: $position")

fun infoWorker(fullName: String, age: Int, maritalStatus: String, position: String) =
    println("ФИО: $fullName, Возраст: $age, Семейное положение: $maritalStatus, Должность: $position")
