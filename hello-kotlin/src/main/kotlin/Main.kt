fun main(args: Array<String>) {

    print("Enter an Integer value: ")
    val string1 = readLine()!!

    // .toInt() function converts the string into Integer
    var integerValue: Int = string1.toInt()
    println("You entered: $integerValue")

    print("Enter a double value: ")
    val string2= readLine()!!

    // .toDouble() function converts the string into Double
    var doubleValue: Double = string2.toDouble()
    println("You entered: $doubleValue")
}
