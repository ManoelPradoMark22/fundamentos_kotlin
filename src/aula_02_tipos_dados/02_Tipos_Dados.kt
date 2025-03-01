package aula_02_tipos_dados

fun main() {

    //Byte -> -128 ~ 127 (range)
    val byte1: Byte = 127
    val byte2: Byte = -128

    //Short (16 Bits de resolução -32768 ~ 32767)
    val short1: Short = -32768
    val short2: Short = 32767

    //Int (32 Bits de resolução (-2^31) ~ (2^31 - 1) )
    val int1: Int = -2147483648 //(-2^31)
    val int2: Int = 2147483647 //(2^31 - 1)

    //para melhor visualização, podemos intercalar entre _ o número
    val int3: Int = 2_147_483_647 // = 2147483647

    //Long (64 Bits de resolução (-2^63) ~ (2^63 - 1) )
    //2^63 = 9_223_372_036_854_775_808
    val long1: Long = -9_223_372_036_854_775_807; //-(2^63 - 1) , because the exactly min_value (-2^63) trigger an error
    //but, there is a workaround to solve this:
    val long2: Long = -9_223_372_036_854_775_807 - 1; //now we can use the exactly min_value (-2^63) with the workaround -(2^63 - 1) - 1
    val long3: Long = -9_223_372_036_854_775_807L - 1;

    val long4: Long = 9_223_372_036_854_775_807 //(2^63 - 1)

    //Float (32 Bits de resolução para representar números de ponto flutuante )
    val float1: Float = -3.4028235E38f
    val float2: Float = 3.4028235E38f

    /*
    * Precisão antes do separador decimal:
    * O Float tem uma precisão de aproximadamente 7 dígitos decimais significativos.
    * Isso significa que, ao armazenar números inteiros muito grandes, pode ocorrer perda de precisão.
    * */

    val float3: Float = 1234567.0f // Precisão OK (7 dígitos)
    val float4: Float = 12345678.0f // Pode perder precisão (8 dígitos)
    //A partir de 7 dígitos inteiros, o número ainda é exato, mas a partir de 8 dígitos pode haver arredondamento.

    /*
    * Precisão depois do separador decimal
    * Quando usamos casas decimais, o Float não pode armazenar todas as frações exatas devido à forma como os números são representados internamente.
    * Exemplo de erro de precisão:
    * */

    val float5: Float = 0.1f + 0.2f
    println("float5 = $float5") //0.3 // no fundo tambem é 0.3000000119... , mas arredondou p 0.3
    println("%.10f".format(float5))// 0.3000000119 (erro de precisão / Float tem precisão menor referente ao Double)


    //Double (64 Bits de resolução para representar números de ponto flutuante )
    //Ele pode armazenar valores de aproximadamente ±4.9 × 10⁻³²⁴ até ±1.8 × 10³⁰⁸

    val doubleMax: Double = 1.7976931348623157E308 // Máximo valor positivo
    val doubleMin: Double = -1.7976931348623157E308 // Mínimo valor negativo
    val doubleTiny: Double = 4.9E-324 // Menor valor positivo representável

    /*Precisão antes do separador decimal:
    * O Double tem uma precisão de aproximadamente 15 a 16 dígitos significativos,
    * o que o torna mais adequado para cálculos científicos e financeiros do que Float.
    * */

    val double1: Double = 123_456_789_012_345.0 // Precisão OK (15 dígitos)
    val double2: Double = 123_456_789_012_345_9.0 // Até 15 ou 16 dígitos, os números inteiros são representados corretamente, mas valores maiores podem sofrer arredondamento.

    /*Precisão depois do separador decimal
     * Assim como Float, Double também pode ter erros de precisão com frações decimais, mas esses erros são menores.
    * */

    val double3: Double = 0.1 + 0.2
    println("double3 = $double3")// 0.30_000_000_000_000_004 (Double tem precisão maior referente ao Float)

    /*
    Tipo	Bits	Precisão (dígitos)	Intervalo aproximado
    Float	32	    ~7	                ±1.4 × 10⁻⁴⁵ até ±3.4 × 10³⁸
    Double	64	    ~15-16	            ±4.9 × 10⁻³²⁴ até ±1.8 × 10³⁰⁸

    - Float deve ser usado quando precisão não é crítica, como em gráficos e jogos.
    - Double é recomendado para cálculos financeiros e científicos, pois minimiza erros de arredondamento.
    * */

    //------------------------

    //DADOS LITERAIS

    //1 caracter apenas
    val char1: Char = 's'

    //lista de caracteres
    val string1: String = "Meu nome é Manoel"

    val string2: String = """
        Meu nome é Manoel
        
        Essas três aspas duplas 
        
        permitem adicionar textos grandes assim
        
        o .trimIndent() é para remover os espaços em branco que tem antes e depois do inicio da sentença (a identaçãoo / tab, pois é usada para organizar o código)
    """.trimIndent()
    println(string2)

    println("-----------------")

    val string3: String = """
        Meu nome é Manoel
        
        Essas três aspas duplas 
        
        permitem adicionar textos grandes assim
    """
    println(string3)

    val string4: String = "$char1 / $byte1 / $long4 / ${byte1 + byte2}"
    println(string4)


    //boolean
    val boolean1: Boolean = true
    val boolean2: Boolean = false
}
