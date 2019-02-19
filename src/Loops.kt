fun main(args: Array<String>) {

    for (x in 1..10){
        println(x)
    }

    var users = listOf("user1","user2","user3")

    for (user in users) {
        println(user)
    }

    for (num in 1..200){
        if (num % 2 != 0){
            println(num)
        }
    }

}