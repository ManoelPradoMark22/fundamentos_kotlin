package aula_03_detalhes_tipos_dados

fun main () {
    val age: Int = 20

    //adicionar meses em formato decimal ao inteiro da idade (converter idade em um tipo de dado numérico flutuante)
    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12

    println("ageDouble = $ageDouble / monthPercent $monthPercent")

    //passaram-se 2 meses

    //ageDouble += 2*monthPercent
    ageDouble = ageDouble + 2*monthPercent

    println("ageDouble after 2 months = $ageDouble")

    //mostrar a idade em formato string com padrão "A idade é X anos"

    val ageText = "A idade é ${ageDouble.toString().plus(other = " anos.")}"

    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())

    val roundedAge = "%.2f".format(ageDouble)
    println("roundedAge: $roundedAge")
    println("A idade é ${roundedAge.toString().plus(other = " anos.")}")

}