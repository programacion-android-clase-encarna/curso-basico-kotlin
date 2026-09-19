package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main(){
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick5
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat5
    }
}

val trick5 ={
    println("No treat")
}
val treat5={
    println("Have a treat")
}