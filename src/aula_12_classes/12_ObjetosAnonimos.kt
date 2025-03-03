package aula_12_classes

//construir um objeto sem a necessidade de informar qual tipo de classe ele representa //sem precisar tipar o objeto
//obj anonimo é sempre singleton - é sempre uma instancia única
//tem a capacidade de assinar contratos de interfaces
//podem acessar variaveis fora do seu escopo de criacao!

//muito utilizado quando uma funcionalidade é SIMPLES e nao justifica a criacao de uma classe completa para tal
//se a lógica de um objeto anonimo for muito grande, talvez seja necessario uma refatoracao para classe

interface ClickCallback {
    fun onClick()
}

fun main() {

    val x = 10

    val objectTemp = object {
        val prop1: Int = 1
        val prop2: String = "Kotlin"

        fun method1() {
            println("Acesso a var de fora do escopo -> x = $x")
        }
    }

    objectTemp.method1()

    val buttonClickCallback = object: ClickCallback {
        override fun onClick() {
            println("Botão clicado!")
        }

    }

    buttonClickCallback.onClick()
}