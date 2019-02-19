fun main(args: Array<String>) {

    class Dog (var name: String, var age: Int, var fur: String){


        fun dogInfo(){
            println("$name is $age years old and the color of its fur is $fur")
        }
    }

    var myDawg = Dog("Reksio",5, "white")

    myDawg.dogInfo()

}