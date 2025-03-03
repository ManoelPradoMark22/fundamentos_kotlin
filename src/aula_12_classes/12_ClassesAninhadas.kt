package aula_12_classes

class Car(val model: String, val year: Int) {
    //dentro de classes aninhadas, nao temos acesso às propriedades da classe superior!

    class Engine {

        fun start() {
            println("Ligando...")
            //println("Nao consigo acessar aqui as props da classe superior Car -> se eu tentar $model dá erro!!!")
        }

        class Fuel (val typeName: String) {
            fun fuelCar() {
                println("Abastecendo o carro com $typeName")
            }
        }

    }

    object Maintenance {
        fun startMaintenance() {
            println("Começando a revisão...")
        }

    }
}

fun main() {

    val car = Car(model = "Chevrolet Onix", year = 2021)
    val carEngine = Car.Engine()
    carEngine.start()

    val fuelType = Car.Engine.Fuel(typeName = "Gasolina")

    fuelType.fuelCar()

    val maintenance = Car.Maintenance//como é um object, nao precisa estanciar
    maintenance.startMaintenance()

}