package aula_10_lacos_de_repeticao

fun main () {

    //for
    val list = listOf(1, 2, 3, 5, 10, "abc", "def", "ghi", false, 10.4)

    for(item in list) {
        println(item)
    }
    println("----------")
    for (i in 1..3) {
        print(i)
    }
    println("----------")
    list.forEach{ item -> println(item) }
    println("----------")
    list.forEachIndexed{ index, item -> println("index = $index | item = $item") }
    println("----------")

    for((index, item) in list.withIndex()){
        println("index = $index | item = $item")
    }
    println("----------")

    //while

    var index = 0
    val maxLimit = 5

    while (index <= maxLimit) {
        println("index = $index | item = ${list[index]}")
        index++
    }
    println("----------")

    var exemp = 5
    print("exemp = ")
    while (exemp > 0) {
        print(exemp)
        exemp--
    }

    println("----------")

    //do while (executa pelo menos uma vez)

    var index1 = 0
    val maxLimit1 = 5

    do {
        println("index1 = $index1 | item = ${list[index1]}")
        index1++
    } while (index1 <= maxLimit1)
    println("----------")

    //break /continue
    var index2 = 0
    val maxLimit2 = 5

    do {
        println("index2 = $index2 | item = ${list[index2]}")

        if(list[index2] == 5) break //interrompe o for

        index2++
    } while (index2 <= maxLimit2)
    println("----------")

    for((index, item) in list.withIndex()){
        if(list[index] == 5) continue // pula esse loop, nao executa as linhas abaixo e pula a iteração, mas nao interrompe o for

        println("index = $index | item = $item")
    }
    println("----------")

    //laços aninhados
    loop@ for(i in 1..3){ //criamos um rótulo para esse primeiro for -> loop@
        for(j in 1..3){

            if(i==2 && j ==2) {
                println("break@loop")
                break@loop
            }
            println("i = $i | j = $j")
        }
    }
    println("----------")

    //repeat
    var index3 = 1

    repeat(times = 5) {
        println(index3)
        index3++
    }

    println("----------")

    var soma = 0
    repeat(5) { i ->
        println("repeat nº ${i + 1}, but, the index is i = $i")
        soma += i
    }
    println("soma = $soma")
}