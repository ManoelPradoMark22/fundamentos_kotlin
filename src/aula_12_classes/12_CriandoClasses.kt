package aula_12_classes

import kotlin.random.Random

class Person(val name: String = "John", val lastName: String = "Doe", val age: Int) {
    fun work() {
        println("$name está trabalhando...")
    }

    val fullName: String = "$name $lastName"

    //private fica visivel somente internamente, no escopo da nossa classe
    private val password: String = "${name}_${Random.nextInt(100)}"

    private fun usePassword() {
        println(password)
    }

    fun visualizePasswordAfterAuthenticated() {
        usePassword()
    }
}

fun main() {

    val jose: Person = Person(name = "José", lastName = "Pinto", age = 20)
    println("jose.name = ${jose.name}")
    println("jose.lastName = ${jose.lastName}")
    println("jose.fullName = ${jose.fullName}")
    println("jose.age = ${jose.age}")
    jose.work()

    println("-------------")

    val unknown: Person = Person(age = 32) //na nossa funcao, se nao passarmos o name/lastname vamos setar como padrao um valor
    println("unknown.name = ${unknown.name}")
    println("unknown.lastName = ${unknown.lastName}")
    println("unknown.fullName = ${unknown.fullName}")
    println("unknown.age = ${unknown.age}")
    unknown.work()

    println("--------------")

    //jose.password //nao consegue acessar o private fora da classe!
    jose.visualizePasswordAfterAuthenticated()
}