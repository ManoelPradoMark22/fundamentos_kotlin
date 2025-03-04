package aula_12_classes

/*restringem a hierarquia de subclasses ou implementacoes que possamos ter baseados na interface de classes seladas
-> com isso engregamos CONTROLE SOBRE A HERANCA no contexto da aplicacao
* */

//muito usado quando precisamos receber um resultado de sucesso, erro ou loading
sealed class Result(val y: Int) { //seald classes podem ter construtores caso queira!, mas nao precisa
    //temos SUBCLASSES da classe selada, que sao definidas no mesmo escopo onde a sealed class é declarada (neste escopo dentro {} )
    //ao se alocar os subestados encapsulados no seald class , temos uma segurança de tipos em relacao à analise de cada um dos subtipos
    data class Success(val data: String): Result(y = 20)

    data class Error(val exception: Exception): Result(y = 20)

    data object Loading: Result(y = 20)

    //abstract val x: Int //precisamos fazer o override acima
    //val x: Int //colocando o valor default, nao preciamos fazer o override acima

    /*ao criar metodos em uma sealed class:
    data class Success(val data: String): Result() {
        override fun x(): String {
            return "test succ"
        }
    }

    data class Error(val exception: Exception): Result() {
        override fun x(): String {
            return "test err"
        }
    }

    data object Loading: Result() {
        override fun x(): String {
            return "test load"
        }
    }

    abstract fun x() : String //tem que ser abstrata
    * */
}

fun handleResult(result: Result) {
    println(
        when(result) {
            is Result.Error -> "Houve um erro! ${result.exception.message}"
            Result.Loading -> "Carregando... "
            is Result.Success -> "Sucesso! ${result.data}"
        }
    )
}

object Database {

    fun getContacts(): Result{
        return Result.Success(data = listOf("Manoel", "João", "Maria").joinToString())
    }

    fun insertContacts(contact: String): Result{
        return Result.Error(exception = IllegalArgumentException("O contato a ser inserido possui caracteres inválidos"))
    }

    fun updateContact(id: Int, newContact: String): Result {
        return Result.Loading
    }

}

//interface
sealed interface Animal5 { //nao pode ter construtor!
    data class Dog(val breed: String): Animal5 {//nao precisou instanciar
        override val x: Int
            get() = super.x * 2

        override val y: Int
            get() = 4

        override fun sound(): String {
            return "Au-Au!"
        }
    }

    data class Cat(val color: String): Animal5 {
        override fun sound(): String {
            return "Miau!"
        }

        override val y: Int
            get() = 2
    }

    data object Bird: Animal5 {
        override fun sound(): String {
            return "Piu!"
        }

        override val y: Int
            get() = 6
    }

    fun sound(): String //na interface, nao precisa do abstract
    val x: Int
        get() = 10 //ao colocar um valor default, nao precisamos usar o override nas classes acima - mas podemos se quisermos!

    val y: Int //como nao colocamos o default, vai ser obrigatorio
}

fun handleAnimal(animal: Animal5) {
    println(
        when(animal) {
            is Animal5.Cat -> """
                Animal: Gato
                Som: ${animal.sound()}
                Cor: ${animal.color}
            """.trimIndent()
            is Animal5.Dog -> """
                Animal: Cachorro
                Som: ${animal.sound()}
                Raça: ${animal.breed}
            """.trimIndent()
            Animal5.Bird -> """
                Animal: Pássaro
                Som: ${animal.sound()}
            """.trimIndent()
        }

    )
}

fun main() {
    val contacts: Result = Database.getContacts()
    val isContactInserted: Result = Database.insertContacts(contact = "Fernando")
    val isContactUpdated: Result = Database.updateContact(id = 1, newContact = "Fernando")

    handleResult(contacts)
    handleResult(isContactInserted)
    handleResult(isContactUpdated)

    val dog = Animal5.Dog(breed = "Poodle")
    val cat = Animal5.Cat(color = "Yellow")
    val bird = Animal5.Bird

    println("----------")
    handleAnimal(animal = dog)
    println("----------")
    handleAnimal(animal = cat)
    println("----------")
    handleAnimal(animal = bird)
}
