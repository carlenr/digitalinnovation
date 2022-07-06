package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "123.752.789-00", 5000.00, "senha125")
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}