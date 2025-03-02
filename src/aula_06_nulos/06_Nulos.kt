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

    //funcao LET - Evitar repetição de variáveis (it como referência ao objeto)

    var z: Int? = null

    //O let é frequentemente usado com o operador "safe call" (?.) para evitar NullPointerException.
    //apenas se z nao for nulo esse codigo dentro do escopo é executado
    z?.let {it ->
        println("1 - dentro do let. z = $it")
    }

    val nome: String? = "Kotlin"

    nome?.let {
        println("Olá, $it!")
    } ?: println("Nome é nulo")

    val numero: Int? = null
    numero?.let {
        println(it * 2)
    }
}