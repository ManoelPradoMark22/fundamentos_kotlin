package aula_12_classes

enum class Direction {
    //podemos adicionar, dentro do escopo da nossa classe enumerada, conseguimos alocar CONSTANTES que farão parte do contexto desta classe enumerada
    //para definir os valores fixos, criamos palavras todas MAIÚSCULAS
    NORTH,  //0
    SOUTH,  //1
    EAST,   //2
    WEST,   //3
}

enum class Direction2(val description: String) {
    NORTH(description = "Direção Norte"),
    SOUTH(description = "Direção Sul"),
    EAST(description = "Direção Leste"),
    WEST(description = "Direção Oeste");

    fun checkDirections(direction: Direction2) {
        println("""
            ${"actual description = ${this.description}"}
            ${"given description = ${direction.description}"}
        """.trimIndent())
    }

    companion object {
        fun concatDirectionDescription(firstDirection: Direction2, secondDirection: Direction2) {
            println("${firstDirection.description}-${secondDirection.description}")
        }
    }
}

enum class Direction3(val description: String) {
    NORTH(description = "Direção Norte") {
        override fun symbol(): Char {
            return '↑'
        }

        override val symbol: Char
            get() = '↑'
    },
    SOUTH(description = "Direção Sul") {
        override fun symbol(): Char {
            return '↓'
        }

        override val symbol: Char
            get() = '↓'
    },
    EAST(description = "Direção Leste") {
        override fun symbol(): Char {//necessario, pois symbol() é abstract
            return '→'
        }

        override val symbol: Char //necessario, pois symbol é abstract
            get() = '→'
    },
    WEST(description = "Direção Oeste") {
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    };

    fun checkDirections(direction: Direction2) {
        println("""
            ${"actual description = ${this.description}"}
            ${"given description = ${direction.description}"}
        """.trimIndent())
    }

    companion object {
        fun concatDirectionDescription(firstDirection: Direction2, secondDirection: Direction2) {
            println("${firstDirection.description}-${secondDirection.description}")
        }
    }

    abstract fun symbol(): Char
    abstract val symbol: Char
}

fun main() {

    val north = Direction.NORTH

    println("north.ordinal = ${north.ordinal}")
    println("north.name = ${north.name}")

    val north2 = Direction2.NORTH

    println("north2.ordinal = ${north2.ordinal}")
    println("north2.name = ${north2.name}")
    println("north2.description = ${north2.description}")

    north2.checkDirections(direction = Direction2.WEST)

    Direction2.concatDirectionDescription(firstDirection = Direction2.NORTH, secondDirection = Direction2.SOUTH)

    //entries

    println(Direction2.entries)

    Direction2.entries.forEach{item ->
        println(item) //item.name
        println(item.ordinal)
        println(item.description)
    }

    println("----------")
    println("valueOf")

    //valueOf

    println(Direction2.valueOf(value = "SOUTH").ordinal)

    try {
        println(Direction2.valueOf(value = "ABCV").ordinal)
    } catch(e: IllegalArgumentException) {
        println(e.message)
        println("ABCV is not an enum constant")
    }

    println("----------")
    Direction3.entries.forEach{item ->
        println("${item.symbol()} | ${item.symbol}")
    }
}