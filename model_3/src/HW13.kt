/**
 * Напишите функцию, принимающую на вход имена сотрудников и
 * возвращающую их количество. Используйте для этого vararg, из
 * предыдущей темы.
 */
fun main() {
    print("Количество сотруднико = ")
    val workers = arrayOf("Вася", "Таня", "Петя", "Коля")
    print(countWorkerName(*workers))

}

fun countWorkerName(vararg workerName: String): Int = workerName.size
