/**
 * 1. Напишите программу, запрашивающую имя пользователя и выводящую
 * приветствие пользователя в консоль, после ввода имени.
 */
fun main() {
    print("Write name: ")
    var userText: String? = readLine()

    var name: String = userText.toString();

    print("Hello, $name")

}