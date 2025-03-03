package aula_12_classes

//class interna tem que ser uma classe dentro de uma classe - classe aninhada
//vantagem! podemos usar os métodos da classe superior dentro da classe interna!!!!

class Car2(val model: String, val year: Int) {

    inner class Engine {

        fun start() {
            println("$model ($year)")
            println("Ligando...")
        }

        inner class Fuel(val typeName: String) {

            fun fuelCar() {
                println("Abastecendo o carro '$model' com '$typeName'")
            }

        }

    }

}

fun main() {

    //mas note que, para tanto, precisamos primeiro instanciar a classe superior, para entao instanciar a interna.
    val car = Car2(model = "Chevrolet Onix", year = 2021)
    val carEngine = car.Engine()
    val carEngineFuelType = carEngine.Fuel(typeName = "Gasolina")

    carEngineFuelType.fuelCar()
    carEngine.start()

}