fun main() {
    println("Digite um número:")
    val num = readln()!!.toDouble()
    val ant = num - 1
    val sus = num + 1
    println("O número é $num e seu antecessor é $ant e seu sucessor é $sus.")

}