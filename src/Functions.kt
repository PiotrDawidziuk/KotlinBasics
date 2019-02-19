fun main(args: Array<String>) {

    fun hello () {
        println("hello world")
    }

    fun greeting(name: String = "Anonymous"): String {
        return "Good morning $name"
    }

    for (x in 1..3){
        println(greeting("Jake"))
    }
    println(greeting())

    fun addNumbers (num1: Int, num2: Int) = num1 + num2

    println(addNumbers(2,4))
}