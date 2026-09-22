package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`03 tipo enumerado`

//T = tipo genérico
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Dificulty  //de tipo enumerado


) {
    override fun toString(): String {
        return "Question(questionText='$questionText', answer=$answer, difficulty='$difficulty')"
    }
}

fun main(){
    val question1=Question<String>("citó el cuervo","nunca más", Dificulty.MEDIUM)
    val question2= Question<Boolean>("El cielo está verde. True o false", false, Dificulty.EASY)
    val question3=Question<Int>("Cuantos dias hay entre lunas llenas",28, Dificulty.HARD)

    println(question1)
    println(question2)
    println(question3)
}
