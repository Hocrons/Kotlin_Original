fun main(){
    println("Qual o seu nome?")
    val name = readln()
    println("Digite a nota da primeira prova:")
    val nota1 = readln()!!.toDouble()
    println("Digite a nota da segunda prova:")
    val nota2 = readln()!!.toDouble()
    val media = (nota1 + nota2)/2
    println("A média do aluno $name é igual a $media")
}