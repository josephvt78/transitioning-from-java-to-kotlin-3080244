fun Fact(num: Int): Long {
    return if (num == 1) num.toLong() // terminate condition
    else num * Fact(num - 1)
}
// main method
fun main()
{
    println("Factorial of 6 is: " + Fact(6))
    // Recursive call
}