package aula_12_classes

/*assemelha-se muito com classe abstrata, porém, a classe abstrata só pode ser herdada UMA ÚNICA VEZ dentro do contexto de HERANÇA -> ou seja, uma classe só pode herdar UMA classe abstrata específica
* Porém, as interfaces garantem Heranças múltiplas -> uma classe pode herdar VÁRIAS INTERFACES! -> varios contratos podem ser assinados, de diferentes escopos, que podem complementar um determinado contexto no qual sua classe esta trabalhando
* */

data class Document(val text: String)

interface Printer {
    fun print(text: String): Document

    val printerType: String
}

interface TextConverter {
    val defaultText: String
        get() = "Initial string default"

    //fun convert(text: String, printerType: String): String
    //or if we can use defaultText:
    fun convert(text: String, printerType: String): String {
        return text.ifEmpty { defaultText } //o mesmo que: if (text.isEmpty()) defaultText else text
    }
}

//nao precisamos instanciar a interface Printer nem a Textconverter para fazer o vinculo de hierarquia (diferentemente da abstrata)
//podemos utilizar herancas multiplas das interfaces
class PdfPrinter: Printer, TextConverter {
    override fun print(text: String): Document {
        val parsedText = convert(text = text, printerType = printerType)
        println("PDF: $parsedText")
        return Document(text = parsedText)
    }

    override val printerType: String
        get() = "PDF"

    override fun convert(text: String, printerType: String): String {
        println("Convertendo text $text para o tipo $printerType")
        return text
    }

}

class WordPrinter: Printer, TextConverter {
    override fun print(text: String): Document {
        val parsedText = convert(text = text, printerType = printerType)
        println("Word: $parsedText")
        return Document(text = parsedText)
    }

    override val printerType: String
        get() = "Word"

    override fun convert(text: String, printerType: String): String {
        println("Convertendo text $text para o tipo $printerType")
        return text
    }

}

fun main() {

    val pdfPrinter = PdfPrinter()
    val pdfDocument: Document = pdfPrinter.print("Hello Pdf!")
    println(pdfDocument)

    val wordPrinter = WordPrinter()
    val wordDocument: Document = wordPrinter.print("Hello Word!")
    println(wordDocument)
}