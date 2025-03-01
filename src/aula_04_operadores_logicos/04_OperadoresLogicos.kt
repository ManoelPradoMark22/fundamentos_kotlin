package aula_04_operadores_logicos

fun main() {

    val a = true
    val b = false
    val c = true

    //operador E (&&)

    val result = a && b
    val result2 = a && c

    println("a = $a | b = $b | c = $c")
    println("a && b = $result")
    println("a && c = $result2")

    //operador OU (||)

    val result3 = a || b
    val result4 = a || c

    println("a || b = $result3")
    println("a || c = $result4")

    //operador NÃO (!)

    val result6 = !a

    println("a = $a")
    println("!a = $result6")

    //operador de igualdade (==)

    val result7 = a == b

    println("a == b = $result7")

    //operador de desigualdade (!=)

    val result8 = a != b

    println("a != b = $result8")

    //operadores "É DO TIPO" (is) e "E NÃO É DO TIPO" (!is)
    val num: Any = 1
    val numText: Any = "1"

    println("num is String = ${num is String}")
    println("numText is String = ${numText is String}")

    println("num !is String = ${num !is String}")
    println("numText !is String = ${numText !is String}")

    //operadores PERTENCE (in) e NÃO PERTENCE (!in)
    val range = 1..10
    val x = 5
    val y = 15

    println("x in range = ${x in range}")
    println("y in range = ${y in range}")

    println("x !in range = ${x !in range}")
    println("y !in range = ${y !in range}")

    val z = 10
    println("z = $z")
    println("z in 1..20 = ${z in 1..20}")
}
