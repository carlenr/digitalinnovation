package one.digitalinnovation.digionebank

class Pessoa {
    val nome: String = "Carlos"
    val cpf: String = "123.456.789-00"
}

fun main(){
    var carlos = Pessoa()
    println(carlos.nome)
    println(carlos.cpf)
}