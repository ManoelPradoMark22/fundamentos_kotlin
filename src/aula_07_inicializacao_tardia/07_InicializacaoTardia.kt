package aula_07_inicializacao_tardia

import kotlin.properties.Delegates

fun main() {

     //lateinit

    lateinit var a: String

    //.....

    //println(a)//vc só pode usar ela ao atribuir o valor, se não da erro!!!

    a = "Kotlin lateinit"

    println("a = $a")

    //-------------------
    //lazy - inicializacao é feita na primeira vez que ela é utilizada!

    val b: String by lazy {
        //....
        "Kotlin lazy"
    }
    println("b = $b")


    //lateinit var c: Int //nao pode dessa forma para tipos primitivos!
    var c: Int by Delegates.notNull() // dessa forma funciona.
    c = 10
    println("lateinit with Int - var c: Int by Delegates.notNull() / c = $c")
}