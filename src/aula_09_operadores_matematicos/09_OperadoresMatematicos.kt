package aula_09_operadores_matematicos

import kotlin.math.*

fun main() {
    val num = 4
    val num2 = 2

    println("num + num2 ${num + num2}")
    println("num - num2 ${num - num2}")
    println("num * num2 ${num * num2}")
    println("num / num2 ${num / num2}")
    println("num % num2 ${num % num2}")

    //incremento

    var num3 = 10
    var num4 = 20

    println("num3 = $num3")
    num3++
    println("num3++ -> num3 = $num3")

    println("num4 = $num4")
    num4--
    println("num4-- -> num4 = $num4")

    println("num3 = $num3")
    ++num3//usado antes da variavel
    println("++num3 -> num3 = $num3")

    //Atribuição composta
    println("----------")

    var num5 = 1

    println("num5 = $num5")
    num5+= num
    println("num5+= $num -> num5 = $num5")

    println("----------")
    println("num5 = $num5")
    num5-= num
    println("num5-= $num -> num5 = $num5")

    println("----------")
    println("num5 = $num5")
    num5*= num
    println("num5*= $num -> num5 = $num5")

    println("----------")
    println("num5 = $num5")
    num5/= num
    println("num5/= $num -> num5 = $num5")

    println("----------")
    println("num5 = $num5")
    num5%= num
    println("num5%= $num -> num5 = $num5")

    //biblioteca math
    val value = 2.567
    val valueRouded = round(value)
    println("value = $value")
    println("valueRouded (round()) = $valueRouded")

    val value1 = 2.467
    val valueRouded1 = round(value1)
    println("value1 = $value1")
    println("valueRouded1 (round()) = $valueRouded1")

    val value2 = 2.5
    val valueRouded2 = round(value2)
    println("value2 = $value2")
    println("valueRouded2 (round()) = $valueRouded2")

    val value3 = 2.9
    val valueRouded3 = floor(value3) //floor -> sempre arredonda p baixo
    println("value3 = $value3")
    println("valueRouded3 (floor()) = $valueRouded3")

    val value4 = 2.1
    val valueRouded4 = ceil(value4) //ceil -> sempre arredonda p cima
    println("value4 = $value4")
    println("valueRouded4 (ceil()) = $valueRouded4")

    //potência
    val base = 2.0
    val exponent = 3.0
    val valuePow = base.pow(exponent) //2^3 = 2*2*2 = 8
    println("base.pow(exponent) = $base.pow($exponent) = $valuePow")

    //log

    val logValue = log10(100.0) // 10*10 = 100

    println("log10(100.0) = $logValue")



    //*************************************************
    //para assimilar, as funcoes acima como sao no Java:
    /*
    //biblioteca math
    val value = 2.567
    val valueRouded = Math.round(value)
    println("value = $value")
    println("valueRouded (Math.round()) = $valueRouded")

    val value1 = 2.467
    val valueRouded1 = Math.round(value1)
    println("value1 = $value1")
    println("valueRouded1 (Math.round()) = $valueRouded1")

    val value2 = 2.5
    val valueRouded2 = Math.round(value2)
    println("value2 = $value2")
    println("valueRouded2 (Math.round()) = $valueRouded2")

    val value3 = 2.9
    val valueRouded3 = Math.floor(value3) //floor -> sempre arredonda p baixo
    println("value3 = $value3")
    println("valueRouded3 (Math.floor()) = $valueRouded3")

    val value4 = 2.1
    val valueRouded4 = Math.ceil(value4) //ceil -> sempre arredonda p cima
    println("value4 = $value4")
    println("valueRouded4 (Math.ceil()) = $valueRouded4")

    //potência
    val base = 2.0
    val exponent = 3.0
    val valuePow = Math.pow(base, exponent) //2^3 = 2*2*2 = 8
    println("Math.pow(base, exponent) = Math.pow($base, $exponent) = $valuePow")

    //log

    val logValue = Math.log10(100.0) // 10*10 = 100

    println(logValue)
    * */

}