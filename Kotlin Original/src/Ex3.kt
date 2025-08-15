fun main() {
    println("Me diga seu nome:")
    val name = readln()
    println("Agora me diga seu salário:")
    val salario = readln()!!.toDouble()
    println("O funcionário $name tem um salário de $$salario")
}