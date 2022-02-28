package br.com.fiap.bean

class ContaPoupanca(agencia: Int,
                    numero: Int,
                    private var taxa: Float,
                    private val rendimento: Float) : Conta(agencia, numero), ContaInvestimento {

    override fun sacar(valor: Double) {
        if(this.saldo > (valor + taxa)) {
            this.saldo - taxa
            super.sacar(valor)
        }
    }

    override fun calculaRetornoInvestimento() : Double {
       return saldo * rendimento
    }
}