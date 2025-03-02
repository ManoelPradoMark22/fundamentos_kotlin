package aula_11_funcoes

fun isIntEven(num: Int) : Boolean {
    return num % 2 == 0
}

fun main() {
    val num = 4

    println("$num é par? ${isIntEven(num = num)}")
}