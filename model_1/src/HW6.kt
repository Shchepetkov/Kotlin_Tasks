/**
 * Напишите программу, которая запрашивает у пользователя два числа в
 * переменные “a” и “b”. Проверьте больше ли "a" чем "b" и получите
 * результат в виде переменой типа boolean.
 */
fun main() {
    print(comparingTwoNumbers())
}

fun comparingTwoNumbers(): Boolean {
    var countFirstNumber: Int? = null
    var countSecondNumber: Int? = null

    while (countFirstNumber == null) {
        print("Enter the number a: ")
        countFirstNumber = readLine()?.toIntOrNull()
        if (countFirstNumber == null) {
            println("you didn't enter a number, try again!")
            continue
        }
        while (countSecondNumber == null) {
            print("Enter the number b: ")
            countSecondNumber = readLine()?.toIntOrNull()
            if (countSecondNumber == null) {
                println("you didn't enter a number, try again!")
                continue
            }
        }
    }
    return countFirstNumber > countSecondNumber!!
}