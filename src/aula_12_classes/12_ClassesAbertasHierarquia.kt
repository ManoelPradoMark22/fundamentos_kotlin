package aula_12_classes

open class Animal(val name: String) {//open - classe aberta - para abstrair a herança

    open val age: Int = 0

    open fun sound() {
        println("$name: SOM")
    }

}

class Dog(override val age: Int): Animal(name = "Cachorro") {

    override fun sound() {//aqui estamos sobreescrevendo a fn sound
        println("$name Au-Au!")
    }

}

fun main() {
    val dog = Dog(age = 5)

    dog.sound()
    println(dog.age)
}