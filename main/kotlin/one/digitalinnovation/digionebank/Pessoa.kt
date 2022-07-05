package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf: String = "123.456.789-00"
    private set
}

fun main(){
    val carlos = Pessoa()
    println(carlos.nome)
    println(carlos.cpf)
}