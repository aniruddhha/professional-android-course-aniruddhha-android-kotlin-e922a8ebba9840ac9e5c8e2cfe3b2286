package basics

const val PI = 3.17 // at the time of compilation value needs to be assigned
val cityOne = decideName()
//const val cityTwo = decideName() // ❌ it wont work
const val cityThree = "nbm"
//const var speed = 100 // ❌ this is a contradiction

fun main() {
    val num1 = 10
    var num2 = 20

//    num1 = 90 // ❌
    num2 = 90 // ✅

    val name = "abc"
//    name = "pqr" // ❌

    println(PI)
}

fun decideName() : String {
    return "abc"
}