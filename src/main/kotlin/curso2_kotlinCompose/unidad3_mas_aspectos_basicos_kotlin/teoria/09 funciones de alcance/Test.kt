package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`09 funciones de alcance`

import curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`04 clase de datos`.Dificulty
import curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`04 clase de datos`.Question
import curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`08 interfaces`.ProgressPrintable


interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz: ProgressPrintable {
    val question1 = Question<String>("citó el cuervo", "nunca más", Dificulty.MEDIUM)
    val question2 = Question<Boolean>("El cielo está verde. True o false", false, Dificulty.EASY)
    val question3 = Question<Int>("Cuantos dias hay entre lunas llenas", 28, Dificulty.HARD)
    override val progressText: String
        get() = "${Quiz.answered}  of ${Quiz.total} answered"

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    //Método sin función de alcance let()
    /*fun printQuiz() {
        println(question1.questionText)
        println(question1.answer)
        println(question1.difficulty)
        println()
        println(question2.questionText)
        println(question2.answer)
        println(question2.difficulty)
        println()
        println(question3.questionText)
        println(question3.answer)
        println(question3.difficulty)
        println()
    }*/

    //Función con uso de función de alcance let()
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

//funciones de alcance ( let y apply)
/*Evitan tener que usar el nombre del objeto para acceder
a sus atributos y métodos. Hace más legible el código */
fun main() {
    val quiz= Quiz()

    //Forma1 de acceder a métodos del objeto quiz
   /* quiz.printProgressBar()
    quiz.printQuiz()
    */

    //Forma2 de acceder a métodos del objeto Quiz()
    /*
    Quiz().printProgressBar()
    Quiz().printQuiz()
    */

    //Forma3: usando la función de alcance apply
    Quiz().apply(){
        printQuiz()
        printProgressBar()
    }


}