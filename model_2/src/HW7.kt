/**
 * Напишите тест на любую тему. Пользователь должен вводить номер
 * варианта из предложенных ответов.
 *
 * Придумайте минимум 5 вопросов. Вывод результата тестирования должен
 * происходить через оператор when, в виде текстового комментария
 * (пример: «Ваши знания истории на крепкую четверку»).
 *
 * ------- Тема: Математика для младших классов -------
 */
fun main() {

    println("Это тест для младших классов, нужно указывать номер ответа от 1 до 4")
    val questionsAndAnswer =
        mapOf(
            "5/5 = ?" to 2,
            "2+3 = ?" to 3,
            "2+1 = ?" to 4,
            "21+3 = ?" to 2,
            "4+48 = ?" to 3
        )

    val answerOptions =
        listOf(
            "2", "1", "3", "7",
            "23", "32", "5", "0",
            "41", "2", "7", "3",
            "4", "25", "6", "9",
            "25", "5", "52", "13"
        )

    var start = 0
    var finish = 3

    for (i in questionsAndAnswer) {
        for (j in answerOptions) {
            println(i.key)
            println(answerOptions.slice(start..finish))

            var countFirstNumber: Int? = null

            while (countFirstNumber == null) {
                print("Введите номер ответа: ")
                countFirstNumber = readLine()?.toIntOrNull()
                if (countFirstNumber == null) {
                    println("Вы ввели не число, попробуйте еще раз!")
                    continue
                }
            }

            when (countFirstNumber) {
                i.value -> {
                    println("Молодец, это правильный ответ")
                    start += 4
                    finish += 4
                    break
                }
                else -> {
                    println("Ответ не верный. Правильный ответ ${i.value}")
                    start += 4
                    finish += 4
                    break
                }
            }
        }
    }
}