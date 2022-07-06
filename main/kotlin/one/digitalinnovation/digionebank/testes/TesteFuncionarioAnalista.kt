package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("João Pedro", "123.456.789-00", 2000.00)
    ImprimeRelatorioFuncionario.imprime(joao)
}
