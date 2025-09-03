fun main() {
    println("Quanto dinheiro você tem na carteira?")
    val carteira = readln().toDouble()
    val dolar = carteira / 3.45
    println("Com esse valor você consegue ter ${"%.2f".format(dolar)} dólares!")
}