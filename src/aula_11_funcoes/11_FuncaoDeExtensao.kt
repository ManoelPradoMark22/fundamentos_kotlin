package aula_11_funcoes

//permitem adicionar NOVAS FUNCIONALIDADES À classes já existentes sem precisar modificar o código original!

fun String.isPalindrome() : Boolean {//checar se uma String é um palíndromo. RADAR é um palíndromo. ->RADAR-> == <-RADAR<-
    val parsedString = this.lowercase()
    return parsedString == parsedString.reversed()
}

fun Double.formatTruncateDecimals(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    val stringToCheck: List<String>  = listOf("Radar", "radar", "banana", "Osso", "Roma é Amor")

    for(str in stringToCheck) {
        println("->$str-> == <-${str}<- | ( ${str.isPalindrome()} )")
    }

    val doublesToTruncate: List<Double> = listOf(23.3221, 234343.4341, 5454.4332133)

    for(number in doublesToTruncate) {
        println("$number -> ${number.formatTruncateDecimals(2)}")
    }
}