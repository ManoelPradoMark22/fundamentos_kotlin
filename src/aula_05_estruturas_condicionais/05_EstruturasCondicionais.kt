package aula_05_estruturas_condicionais

fun main() {
    val x = 100
    val y = 50

    if(x>y) {
        println("x>y")
    }else if(x<y){
        println("x<y")
    }else if(x==y){
        println("x==y")
    }else {
        println("else / default")
    }

    //podemos vincular estruturas condicionais a resultados

    val a = 50
    val b = 100

    val result = if(a>b) {
        "a>b"
    }else if(a<b){
        "a<b"
    }else if(a==b){
        "a==b"
    }else {
        "else / default"
    }

    println("result = $result")

    //WHEN
    val result2 = when(x) {
        in 1..99 -> "1..99"
        100 -> "100"
        in 101..200 -> "101..200"

        else -> "else"
    }

    println("result2 = $result2")

    val result3 = when(y) {
        in 1..99 -> "1..99"
        100 -> "100"
        in 101..200 -> "101..200"

        else -> "else"
    }

    println("result3 = $result3")
}