import br.com.fiap.bean.ContaCorrente
import br.com.fiap.bean.ContaPoupanca
import br.com.fiap.bean.TipoConta

fun main() {
    //USO DA CONTA CORRENTE
    val contaCorrente = ContaCorrente(1000, 1234, TipoConta.COMUM)
    val contaCorrente2 = ContaCorrente(1000, 5678,TipoConta.COMUM)
    val contaCorrente3 = ContaCorrente(1000, 9012,TipoConta.COMUM)
    val contaCorrenteList = arrayListOf(contaCorrente,contaCorrente2,contaCorrente3)

    contaCorrente.depositar(100.0)
    contaCorrente2.depositar(200.0)
    contaCorrente3.depositar(300.0)

    contaCorrente.sacar(50.0)
    contaCorrente2.sacar(30.0)
    contaCorrente3.sacar(20.0)

    //TESTE DO METODO SACAR
    //contaCorrente.sacar(50.1)

    //EXIBIR SALDO DE 3 CONTAS
    contaCorrenteList.forEach{ println("Saldo da conta corrente: ${it.saldo}") }

    //USO DA CONTA CORRENTE
    val contaPoupanca = ContaPoupanca(1000, 1234, 1.0F, 0.01F)

    contaPoupanca.depositar(100.0)

    //TESTE DO METODO SACAR
    contaPoupanca.sacar(50.0)

    //TESTE DO METODO CALCULO RETORNO INVESTIMENTO
    contaPoupanca.calculaRetornoInvestimento()

    println("Saldo conta poupança: ${contaPoupanca.saldo}")
}