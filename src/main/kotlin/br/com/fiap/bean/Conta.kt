package br.com.fiap.bean

import java.time.LocalDate
import java.util.*

abstract class Conta(private val agencia: Int, private val numero: Int) {
    private val dataAbertura: Calendar
    var saldo: Double
        private set

    init {
        this.dataAbertura = retornarDataAberturaConvertida(LocalDate.now())
        this.saldo = 0.0
    }

    open fun depositar(valor: Double){
        if(valor > 0)
            this.saldo += valor
    }

    open fun sacar(valor: Double){
            this.saldo -= valor
    }

    private fun retornarDataAberturaConvertida(localDate: LocalDate) : Calendar{
        return Calendar.Builder().setDate(localDate.year, localDate.month.value, localDate.dayOfMonth).build()
    }
}