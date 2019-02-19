fun main(args: Array<String>) {
    var dogs = mutableMapOf("Fido" to 8, "Reksio" to 3,"Fafik" to 4)

    println(dogs["Reksio"])

    dogs["Maksio"] = 5

    println(dogs)
}