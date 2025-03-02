package aula_11_funcoes

fun sum(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

//fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Unit): Int {}  // -> Unit se a funcao nao fosse retornar nada
fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val divide = { a: Int, b: Int -> a / b }

    println(mathOperation(a= 10, b = 5, operation = ::sum))  // ::sum   -> referencia da funcao será a funcao sum
    println(mathOperation(a= 10, b = 5, operation = ::subtract))
    println(mathOperation(a= 10, b = 5, operation = ::multiply))

    println(mathOperation(a= 10, b = 5, operation = divide)) //nesse caso, para a arrow function, nao é necessario usar o ::
}