package aula_08_colecoes_listas

fun main() {

    //set
    //gera uma coleção de elementos ÚNICOS, mas permite diferentes tipos de dados
    //nao é possivel acessarmos uma posicao especifica do set, por exemplo, set1[1] não é possível

    //set imutável
    val set = setOf(1, 2, 3, 4, 4, 5) //ignora os duplicados -> [1, 2, 3, 4, 5]
    println(set)

    val set1 = setOf(1, 2, 3, "Manoel", "Kotlin", 4.9, 5f, 0..100, 1, 2, 19, "Kotlin", "Kotlin2")
    //ignora os duplicados -> [1, 2, 3, Manoel, Kotlin, 4.9, 5.0, 0..100, 19, Kotlin2]
    println(set1)

    //set1[1] - não é possivel

    //set mutável

    val setMutable = mutableSetOf(1, 2, 3, "Manoel", "Kotlin", 4.9, 5f, 0..100, 1, 2, 19, "Kotlin", "Kotlin2")

    setMutable.add(10)
    setMutable.remove(2)

    println(setMutable)

    //setMutable[1] - não é possivel

    //hashSet -> mutável (armazena apenas elementos ÚNICOS -> o uso dos hashs traz maior desempenho nas operacoes de busca comuns)
    val hashSet = hashSetOf(1, 2, 3)

    //****************

    //map - conjunto de chaves e valores na listagem Pair <K, V>

    //como definir chave valor? 2 formas, mesmo resultado:
    //Pair(CHAVE, VALOR) / Pair(1, "manoel")
    //CHAVE to VALOR / 1 to "manoel"

    //imutable map (chave deve permanecer o mesmo tipo / valor deve permanecer o mesmo tipo)
    val map = mapOf<Int, String>(Pair(1, "manoel 1"), 2 to "manoel 2", 3 to "manoel 3") // {1=manoel 1, 2=manoel 2, 3=manoel 3}
    println(map)

    //                                                     //error
    //val map = mapOf<Int, String>(Pair(1, "manoel 1"), "manoel 2" to 2, 3 to "manoel 3")

    //                                                  //error
    //val map = mapOf<Int, String>(Pair(1, "manoel 1"), 2 to 23, 3 to "manoel 3")

    println(map.keys)
    println(map.values)
    println(map.entries)

    val map1 = mapOf<Int, String>(Pair(1, "manoel 1"), 2 to "manoel 2", 3 to "manoel 3", 1 to "last manoel 1") // {1=last manoel 1, 2=manoel 2, 3=manoel 3}
    println(map1)

    //mutable map
    val mapMutable = mutableMapOf(1 to "Kotlin", "Kotlin" to 2, 1f to 1.0, 0..10 to 1)

    println(mapMutable)

    mapMutable[3] = "new 3 value" //mapMutable.put(key = 3, value = "new 3 value")
    println("mapMutable[3] = ${mapMutable[3]}")
    println("mapMutable.get(3) = ${mapMutable.get(3)}")
    println("mapMutable['Kotlin'] = ${mapMutable["Kotlin"]}")
    println("mapMutable.get('Kotlin') = ${mapMutable.get("Kotlin")}")
    println(mapMutable)
    mapMutable.remove("Kotlin")
    println(mapMutable)

    println(mapMutable.keys)
    println(mapMutable.values)
    println(mapMutable.entries)

    //hashMap -> mutável (armazena apenas elementos ÚNICOS -> o uso dos hashs traz maior desempenho nas operacoes de busca comuns)
    val hashMap = hashMapOf(1 to "Kotlin")
}