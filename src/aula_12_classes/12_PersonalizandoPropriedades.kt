package aula_12_classes

import kotlin.math.ceil

class Person2(
    val name: String
) {
    var age: Int = 0
        set(value){
            if(value >= 0) field = value
            else println("Idade não pode ser negativa")
        }

    var height: Double = 0.0
        get() = ceil(field)
}

fun main() {
    val joao = Person2(name = "João")

    joao.age = 30
    joao.height = 91.23

    println(joao.age)
    println(joao.height)

    println("------------")

    val jose = Person2(name = "José")

    jose.age = -23
    jose.height = 12.44

    println(jose.age)
    println(jose.height)
}