package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`06 objeto complementario`

import curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`04 clase de datos`.Dificulty
import curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`04 clase de datos`.Question

class Quiz {
    val question1=Question<String>("citó el cuervo","nunca más", Dificulty.MEDIUM)
    val question2= Question<Boolean>("El cielo está verde. True o false", false, Dificulty.EASY)
    val question3=Question<Int>("Cuantos dias hay entre lunas llenas",28, Dificulty.HARD)


    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

fun main(){
    println("${Quiz.answered}  of ${Quiz.total} answered")
}