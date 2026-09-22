package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`05 singleton`

object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}

fun main(){
    println("${StudentProgress.answered} answered questions")
    println("${StudentProgress.total} total questions")
}