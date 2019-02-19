fun main(args: Array<String>) {

    var age: Int? = 30 // nullable

    age = 45
    age = null

    //var newNumber = age!! // not nullable
    //newNumber = null ERROR not nullable

    var user: String? = "user"

    println(user)
    user = null
    println(user)

}