fun main(args: Array<String>) {
    val rollno = 260
    val name = "joe"
    // name = "joe v" //results in compilation error
    val name1 = name
    println("name: ${name1.uppercase()} & roll no: ${rollno}")
}