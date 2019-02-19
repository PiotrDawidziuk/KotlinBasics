fun main(args: Array<String>) {
    var numbers = mutableListOf<Int>(1,2,34,556,12,12,1221)
    var strings = mutableListOf<String>("text1","text2","text3")

    numbers.add(4)
    numbers.removeAt(0)

    println(numbers.size)
    println(strings)

}