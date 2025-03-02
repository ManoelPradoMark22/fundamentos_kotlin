package aula_12_classes

//uma forma de se definir membros ESTÁTICOS para uma classe que vão pertencer (NAO ÀS INSTANCIAS), e sim à classe em específico que estamos construindo

class Person3 {

    companion object {
        //útil quando precisamos de funcoes ou constantes que serão utilitárias (utils), mas que nao precisam especificamente estar associadas às instancias que estamos construindo!
        const val KEY = "12345678"//usado so pela classe, e nao pela instancia

        private const val KEY_2 = "12345678910111213"//usado so pela classe, e nao pela instancia

        fun getCompanionKey(): String {//usado so pela classe, e nao pela instancia
            return "${KEY}+${KEY_2}"
        }
    }

    fun getKey1(): String {//permite retornar a key pela instancia
        return KEY
    }

    fun getKey2(): String {//permite retornar a key pela instancia
        return KEY_2
    }
}

fun main() {

    val key = Person3.KEY //nao precisa criar uma instancia da classe! mas sim diretamente à classe em si
    val keysStr = Person3.getCompanionKey()
    println("key $key")
    println("keysStr $keysStr")

    val jose = Person3()
    //jose.KEY //errado, nao funciona. pois KEY nao faz referencia à instancia, mas sim à classe!

    println("key1 = ${jose.getKey1()}")
    println("key2 = ${jose.getKey2()}")

}