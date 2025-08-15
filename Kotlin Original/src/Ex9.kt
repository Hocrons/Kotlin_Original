fun main(){
    println("Passe uma distância em metros:")
    val dist = readln()!!.toDouble()
    val dist_cm = dist*100
    println("A distância $dist M em cm é $dist_cm Cm")
}