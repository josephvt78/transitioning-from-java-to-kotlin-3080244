fun main(args: Array<String>) {
    val Rollno = 260
    val name = "joe"
    // name = "joe v" //results in compilation error
    val name1 = name
    println("name: ${name1.uppercase()} & roll no: ${Rollno}")
}