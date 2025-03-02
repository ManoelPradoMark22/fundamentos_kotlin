package aula_08_colecoes_listas

fun main() {
    //a lista pode ser mutavel! ou seja, podemos alterar o numero de elementos contidos nela
    //a lista pode conter elementos com TIPOS DIFERENTES

    val list = listOf(1, 2, 3, "maçã", true, 123.4, 1..10)
    val mutableList = mutableListOf(1, 2, 3)

    mutableList.add(4)

    println(list)
    println(mutableList)

    val listInt: List<Int> = list.filterIsInstance<Int>() //filtra de acordo com a instancia do tipo passado -> nesse caso: <Int>
    println(listInt)

    val listIntHigherThan2 = list.filter{ it ->
        it is Int && it > 2
    }
    println(listIntHigherThan2)

    val listIntMessy = listOf(9, 18, 70, 1, 3, 750, 8, 16, 32_550, 2)
    val listStringMessy = listOf("Bernardo", "Alice", "Manoel", "Alberto", "Roberto", "Clara")

    println(listIntMessy.sorted())
    println(listStringMessy.sorted())

    println(listIntMessy.sorted().reversed()) //tem que primeiro fazer o sorted e depois o reversed, se nao nao funciona!
    println(listStringMessy.sorted().reversed())

    //ou use o sortedDescending diretamente!
    println(listIntMessy.sortedDescending())
    println(listStringMessy.sortedDescending())

    val intMax = listIntMessy.max()
    val intMin = listIntMessy.min()

    println(intMax)
    println(intMin)

    val findFirstOdd = list.find{ it ->
        it is Int && it % 2 != 0
    }

    val findLastOdd = list.findLast{ it ->
        it is Int && it % 2 != 0
    }

    val findFirstEven = list.find{ it ->
        it is Int && it % 2 == 0
    }

    val findLastEven = list.findLast{ it ->
        it is Int && it % 2 == 0
    }

    println(findFirstOdd)
    println(findLastOdd)

    println(findFirstEven)
    println(findLastEven)

    val booleanMapIntHigherThan10 = listIntMessy.map { it ->
        it > 10
    }

    println(booleanMapIntHigherThan10)

    //outros métodos:

    println("list = $list")
    println("list.first() = ${list.first()}")
    println("list.last() = ${list.last()}")
    println("list.subList(0, 3) = ${list.subList(0, 3)}")
    println("list[3] = ${list[3]}")
    println("list.indexOf(4) = ${list.indexOf(4)}")
    println("list.indices = ${list.indices}")
    println("list.size = ${list.size}")
    println("list.isEmpty() = ${list.isEmpty()}")
    println("list.isNotEmpty() = ${list.isNotEmpty()}")
    println("list.drop(n = 2) = ${list.drop(n = 2)}")
    println("list.dropLast(n = 2) = ${list.dropLast(n = 2)}")
    println("list.dropWhile { it is Int } = ${list.dropWhile { it is Int }}")
    println("listInt.any { it < 0 } = ${listInt.any { it < 0 }}")
    println("listStringMessy.any { it.startsWith(prefix = 'Z') } = ${listStringMessy.any { it.startsWith(prefix = "Z") }}")
    println("list.all { it is Int } = ${list.all { it is Int }}")
    println("list.zip(listInt) = ${list.zip(listInt)}")
    println("list.elementAt(index = 1) = ${list.elementAt(index = 1)}")
    println("list.getOrNull(index = 10) = ${list.getOrNull(index = 10)}")
    println("listInt.mapIndexed { index, item -> index + item } = ${listInt.mapIndexed { index, item -> index + item }}")
}