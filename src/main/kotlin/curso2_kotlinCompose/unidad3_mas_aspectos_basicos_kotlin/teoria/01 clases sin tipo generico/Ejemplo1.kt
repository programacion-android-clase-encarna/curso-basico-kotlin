package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`01 clases sin tipo generico`

//Diferente en cada clase el tipo del atributo answer
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
