package aula_12_classes

/*classe singleton - object
* Uma única instância entregue para TODA APLICAÇÃO!
* permite usar a instância de forma GLOBAL dentro da aplicação!
* */

//o object já é criado INSTANCIADO! entao, nao é possível usar construtores!
object DatabaseUtil {

    val url: String = "jdbc:mysql//localhost:8080/mydb"
    private val user: String = "admin"
    private val password: String = "admin"

    fun connect() {
        println("user: $user")
        println("password: ****")
        println("Conectando ao database...")
    }

}

//a partir do kotlin 2.0, podemos criar data objects
data object DatabaseHelper_DataObject {

}

fun main() {

    DatabaseUtil.connect() //nao precisa instanciar. usado globalmente na aplicação

    println(DatabaseUtil)
    println(DatabaseHelper_DataObject)
}