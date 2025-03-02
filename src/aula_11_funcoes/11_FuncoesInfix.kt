package aula_11_funcoes

infix fun Int.sum(num: Int): Int = this + num

//class XY(x: Int, y: Int) { // pode ser assim tb
class XY(val x: Int, val y: Int) {
    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x, y = this.y + xy.y)
    }
}

fun main() {

    //infix só podem ser: funcoes de membro de uma classe OU funcoes de extensao
    //so podem aceitar apenas 1 parâmetro
    //não pode aceitar paramêtro "var arg" ou ter um valor padrão inicializado
    //nao pode var arg -> o que é? "var arg" (varios parametros colocados sequencialmente, sem necessidade de um numero fixo desse parametro)

    println(1 sum 2) //nao precisa fazer 1.sum(2), pois o infix é mais sucinto -> 1 sum 2

    println("-------------")

    val xy = XY(x = 1, y = 2) sum XY(x = 2, y = 1) // note que esse sum é o infix interno da classe XY !
    println("xy.x = ${xy.x}")
    println("xy.y = ${xy.y}")
}