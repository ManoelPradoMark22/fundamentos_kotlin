package aula_11_funcoes

fun main() {

    val funSum = {a: Int, b: Int -> a + b}

    println(funSum(1, 2))

    //-----------------

    //variaveis FORA DO ESCOPO da funcao anonima nao podem ser alteradas dentro da funcao anonima
    var sum = 2 + 2

    //variaveis FORA DO ESCOPO da funcao anonima só podem ser alteradas dentro da funcao anonima com o uso do .invoke() ao chamar a funcao
    val funSum2 = { a: Int, b: Int -> {
        sum = 100
        a + b
    }}

    println(funSum2(1, 2).invoke())
    println(sum)
}