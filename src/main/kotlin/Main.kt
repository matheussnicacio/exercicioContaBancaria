fun main() {

    val userA = ContaBancaria()

    userA.depositar()


}


class ContaBancaria {
    private fun saldo(money: Double = 10_000.00): Double {

        return saldo(money)
    }

    private fun titular(name: String = "Matheus", lastName: String = "Nicacio"): String {

        return titular(name, lastName)
    }

    fun depositar(deposito: Double = 10_000.00): Double {

        return depositar(deposito)

    }

    fun sacar(saque: Double = 10_000.00): Double {

        return sacar(saque)

    }

    fun exibirSaldo() {

        println("Saldo")
        saldo(money = 10_000.00)

        return exibirSaldo()

    }


}