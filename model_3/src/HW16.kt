import java.lang.Math.sqrt

/**
 * �������� ������� ��� ���������� ���� Double, ������������ ������
 * �����
 */
fun main() {
    fun Double.sqrtDouble(number: Double) {
        println(sqrt(number))
    }

    val example = 100.0

    example.sqrtDouble(example)
}