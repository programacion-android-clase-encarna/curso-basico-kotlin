package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main(){
    /*val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }*/

    //Reducción1. Omitir el nombre del parámetro
    val coins: (Int) -> String = {
        "$it quarters"
    }

   /* val treatFunction6 = trickOrTreat6(false, coins)
    val trickFunction6 = trickOrTreat6(true, null)
*/
    /*Reducción2. Pasar directamente la función lambda en la llamada
    a la función */
    //val treatFunction6 = trickOrTreat6(false, { "$it quarters"})

    //Reducción3. Pasar la función lambda al final (cuando es el último parámetro)
    //Se puede colocar la expresión lambda después del paréntesis de cierre para llamar a la función
    val treatFunction6 = trickOrTreat6(false) { "$it quarters"}

    val trickFunction6 = trickOrTreat6(true, null)

    treatFunction6()
    trickFunction6()
}

fun trickOrTreat6(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick6
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat6
    }
}

val trick6 ={
    println("No treat")
}
val treat6={
    println("Have a treat")
}