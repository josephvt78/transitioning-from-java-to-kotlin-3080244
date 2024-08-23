fun main(args: Array<String>) {
    //heterogeneous array
    var arr1 = arrayOf(1,2,3,"1","2","3")
    for ((key,value) in arr1.withIndex()) {
        print("$key:$value ")
    }
}
