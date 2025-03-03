package aula_12_classes

class UserClass(var name: String, val age: Int)

data class UserDataClass(var name: String, val age: Int)

fun main() {

    //dataClass

    //data classes nao podem ser abertas! nao conseguimos possibilitar hierarquia nela

    println("dataClass")
    println("--------------")
    val userDataClass = UserDataClass(name = "João", age = 21) //precisa de pelo menos 1 prop para existir (nao pode criar uma dataClass sem nenhuma prop)

    //toString
    println("userDataClass.toString() = ${userDataClass.toString()}")

    //equals (==) -> nas DataClasses ,  equals vai checar o valor de todas as propriedades entre si
    val jose = UserDataClass(name = "José", age = 30)
    val maria = UserDataClass(name = "Maria", age = 30)

    println("jose.toString() = ${jose.toString()}")
    println("maria.toString() = ${maria.toString()}")

    println("jose == maria (${jose == maria})")

    val jose1 = UserDataClass(name = "José", age = 30)

    println("jose1.toString() = ${jose1.toString()}")

    //equals (==) -> na data class,  equals vai checar o valor de todas as propriedades entre si (nao checa o endereço de memoria)
    println("jose == jose1 (${jose == jose1})") //propriedades iguais e valores iguais
    //por mais quie o endereço de memoria seja distinto, vai retornar true pq as props sao iguais!

    //e se usar o == diretamente, vc vai estar colocando no mesmo endereço da memoria (serao os mesmos - alterar algo em um, altera no outro!)
    val maria2 = UserDataClass(name = "Maria", age = 30)
    val maria3 = maria2
    //o mesmo endereço na memória
    println("System.identityHashCode(maria2) = ${System.identityHashCode(maria2)}")//2093176254
    println("System.identityHashCode(maria3) = ${System.identityHashCode(maria3)}")//2093176254

    //se altera o valor em um, altera no outro
    maria3.name = "dasdas"
    println("maria2.name = ${maria2.name}")//dasdas
    println("maria3.name = ${maria3.name}")//dasdas

    //copy - existe apenas em data class

    val mariaOriginal = UserDataClass(name = "Maria Original", age = 27)

    val mariaCopy = mariaOriginal.copy()

    val mariaCopy2 = mariaOriginal.copy(age = 40)

    //diferentes endereços de memória!! melhor uso.
    println("mariaOriginal.toString() = ${mariaOriginal.toString()}")
    println("System.identityHashCode(mariaOriginal) = ${System.identityHashCode(mariaOriginal)}")

    println("mariaCopy.toString() = ${mariaCopy.toString()}")
    println("System.identityHashCode(mariaCopy) = ${System.identityHashCode(mariaCopy)}")

    println("mariaOriginal == mariaCopy (${mariaOriginal == mariaCopy})")

    println("mariaCopy2.toString() = ${mariaCopy2.toString()}")
    println("System.identityHashCode(mariaCopy2) = ${System.identityHashCode(mariaCopy2)}")

    println("mariaOriginal == mariaCopy2 (${mariaOriginal == mariaCopy2})")

    //podemos DESESTRUTURAR DATA CLASSES

    val manoel = UserDataClass(name = "Manoel", age = 28)

    val (name, age) = manoel

    println("manoel.toString() = ${manoel.toString()}")
    println("name = ${name}")
    println("age = ${age}")

    //----------------------

    //class
    println("")
    println("--------------")
    println("class")
    println("--------------")

    val userClass = UserClass(name = "João", age = 20)
    println(userClass.toString())

    var userClass2 = UserClass(name = "João", age = 20)
    //na class normal, ele checa a posição da memoria! por mais que as props sejam iguais, o endereço da memória é diferente
    println("userDataClass == userClass2 (${userClass == userClass2})")

    //----------

    val userClass3 = UserClass(name = "Test", age = 45)

    //se vc fizesse uma instancia receber a outra instancia, ai ss teria a igualdade! (mesmo endereço de memoria)
    val userClass4 = userClass3
    //o mesmo endereço na memória
    println("userClass3.toString() = ${userClass3.toString()}")//aula_12_classes.UserClass@6e8cf4c6
    println("userClass4.toString() = ${userClass4.toString()}")//aula_12_classes.UserClass@6e8cf4c6

    //se altera o valor em um, altera no outro
    userClass4.name = "dasdas"
    println("userClass3.name = ${userClass3.name}")//dasdas
    println("userClass4.name = ${userClass4.name}")//dasdas
}