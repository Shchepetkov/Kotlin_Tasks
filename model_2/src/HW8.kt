/**
 * Напишите программу для расчета дохода по вкладу. Пользователь вводит
 * сумму вклада, длительность вклада (количество месяцев) и ежемесячный
 * процент по вкладу.
 *
 * Программа выводит в консоль информацию по каждому месяцу отдельно.
 * Информация отображает: на сколько будет увеличиваться вклад в этом
 * месяце и итоговую сумму вклада в данном месяце.
 */
fun main() {
    print("Укажите какая будет ссума вклада: ")
    var depositAmount = readLine()!!.toDouble()
    print("Укажите какая будет длительность вклада(в месяцах): ")
    val durationDepositInMonths = readLine()!!.toDouble()
    print("Укажите какай будет ежемесячный процент по вкладу: ")
    val monthlyInterestOnDeposit = readLine()!!.toDouble()

    var totalAmountOnAccount: Double
    var salaryAmount = 0.0

    for (i in 1..durationDepositInMonths.toInt()) {
        totalAmountOnAccount = depositAmount * monthlyInterestOnDeposit / 100 / 12
        println("в $i месяц клиент получит $totalAmountOnAccount")
        salaryAmount += totalAmountOnAccount
        depositAmount += totalAmountOnAccount
        println("--Сумма на счете в $i месяц будет $depositAmount")
    }
    println("Заработано: $salaryAmount")
}