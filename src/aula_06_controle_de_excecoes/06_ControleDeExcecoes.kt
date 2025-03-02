package aula_06_controle_de_excecoes

import java.security.InvalidParameterException

fun main() {
    var x = 1
    try {
        x = 2
        println("x = $x")
    } catch(e: Exception) {
        x = 3
        println("x = $x")
    } finally { //opcional - sempre que o try/catch for concluído, o finally, se usado, é executado
        x = 4
        println("x = $x")
    }

    var y = 1
    try {
        y = 1 / 0
        println("y = $y")
    } catch(e: ArithmeticException) {
        y = 3
        println("y = $y")
        println(e.message)
        println(e::class.java) // class java.lang.ArithmeticException
        println("Erro de Expressão Aritimética")
    } catch(e: Exception) {
        y = 4
        println("y = $y")
        println("Erro genérico")
    }

    var z = 1
    try {
        z = 2
        throw InvalidParameterException()
        println("z = $z")
    } catch(e: ArithmeticException) {
        z = 3
        println("z = $z")
        println(e.message)
        println(e::class.java) // class java.lang.ArithmeticException
        println("Erro de Expressão Aritimética")
    } catch(e: Exception) {
        z = 4
        println("z = $z")
        println(e::class.java)
        println("Erro genérico")
    }

    //coloque o tipo mais genérico sempre por último

    var t = 1

    t = try {
        1 / 0
    } catch(e: ArithmeticException) {
        3
    } catch(e: Exception) {
        4
    }
    println("t = $t")
}