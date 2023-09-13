/**
 * 1. Напишите программу, запрашивающую имя пользователя и выводящую
 * приветствие пользователя в консоль, после ввода имени.
 */
fun main() {
    print("Write name: ")
    val userText: String? = readLine()

    val name: String? = userText

    print("Hello, $name")

}