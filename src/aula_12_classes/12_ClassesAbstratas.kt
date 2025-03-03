package aula_12_classes

//pilar HIERARQUIA - POO
//dar suporte para construirmos CONTRATOS que devem ser implementados pelas subclasses que herdam de classes abstratas
//define que o contexto possui propriedades ou métodos que precisam ser implementados através do formato de CONTRATO no momento da Extensão
//métodos e props abstratos so podem ser CRIADOS em classes abstratas

//pode ter propriedades e métodos concretos e abstratos também
abstract class Vehicle(val color: String) {
    abstract val maxSpeed: Int
    abstract val wheelsAmount: Int

    abstract fun startMovement()

    fun info() {
        println("""
            Velocidade Máxima = $maxSpeed Km/h
            Quantidade de Rodas = $wheelsAmount
            Cor = $color
        """.trimIndent())
    }
}

class Car3(val model: String, val year: Int, color: String): Vehicle(color = color) {
    override val maxSpeed: Int
        get() = 150
    override val wheelsAmount: Int
        get() = 4

    override fun startMovement() {
        println("Ligando o motor...")
    }

    //também podemos sobreescrever metodos/props herdados de forma concreta
    override fun toString(): String {
        //super gera uma instancia de acesso para podermos contemplar tudo o que foi para a classe superior
        super.info()
        return "$model , ${year.toString()}"
    }

}

class Bike(color: String): Vehicle(color = color) {
    override val maxSpeed: Int
        get() = 40
    override val wheelsAmount: Int
        get() = 2

    override fun startMovement() {
        println("Pedalando...")
    }

}

fun main() {

    val car = Car3(model= "Chevrolet Onix", year=2025, color="Branca")
    val bike = Bike(color = "Preta")

    println(car)
    println("-------------")
    println(bike)
    println(bike.maxSpeed)
    println(bike.wheelsAmount)
    println(bike.info())

}