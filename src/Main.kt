//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.math.absoluteValue
fun main()
{
        print("Введите целое число n: ")
        val n = readLine()!!.toInt()
        print("Введите основание степени x: ")
        val x = readLine()!!.toInt()


        var y = 0
        var power: Long = 1
        val nLong = n.toLong()


        while (power.absoluteValue <= nLong.absoluteValue) {
            if (power == nLong) {
                println(y)
                return
            }
            y++
            power *= x
        }
}
