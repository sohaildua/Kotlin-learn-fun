package org.example

class Learn {

}

fun main(args: Array<String>) {
    println("123")
    // // val and var
    val name = "Bulbasaur"
    println(name)
    // val is immutable
    var favFood = "Pizza"
    println(favFood)
    favFood= "Pasta"
    println(favFood)
    // var is immutable

    println("favfood : ${favFood.length}")

    // multiline
    val makeItMultiline= """
        oh my god
        yay
    """.trimIndent()

    println(makeItMultiline)


}
