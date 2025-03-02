package aula_08_Colecoes

fun main() {
    //array, após definido, tem sempre uma quantidade fixa de elementos!

    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val array2: Array<String> = arrayOf("1", "2", "3")

    println(array.joinToString())
    println(array2.joinToString())

    println(array.joinToString(prefix = "[", postfix = "]", separator = " | "))

    val array3: Array<Int> = arrayOf(6, 7, 8, 9, 10)

    //the same:
    val arraySum = array + array3
    val arrayPlus = array.plus(array3)
    //nós so podemos somar arrays de tipos IGUAIS!
    println(arraySum.joinToString())
    println(arrayPlus.joinToString())


}
