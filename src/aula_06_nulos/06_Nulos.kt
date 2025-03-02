package aula_06_nulos

fun main() {

    var a: String? = null

    var result: String = a ?: "Kotlin"

    println("result = $result")

    var b: String? = null

    b = "Teste"

    var result2: String = b ?: "Teste 2"

    println("result2 = $result2")



    var c: Int = -1

    c = a?.toInt() ?: 1

    println("c = $c")

    if(a != null) {
        //operador de acersao nao nula
        println("a!!.toInt() = ${a!!.toInt()}")
    }

    var d = a as? Int

    println(d)

    //funcao LET - executa apenas se o valor nao for null

    //apenas se b nao for nulo esse codigo dentro do escopo é executado
    b?.let {it ->
        println(it)
    }
}