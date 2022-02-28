package br.com.fiap.bean

import java.lang.RuntimeException

class ContaCorrente(agencia: Int, numero: Int, private val tipo: TipoConta) : Conta(agencia, numero) {

    override fun sacar(valor: Double) {
        if (tipo == TipoConta.COMUM && (saldo - valor) < 0)
            throw RuntimeException("Conta comum não pode ter valor negativo")
        else
            super.sacar(valor)
    }
}