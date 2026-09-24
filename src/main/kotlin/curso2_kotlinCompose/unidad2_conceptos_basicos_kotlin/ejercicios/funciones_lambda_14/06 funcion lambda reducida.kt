package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.funciones_lambda_14

fun main(){
    //Reducción1.-HACER Omitir el nombre del parámetro
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }


    /*Reducción2.-HACER Pasar directamente la función lambda en la llamada
      a la función */

    val treatFunction6 = trickOrTreat6(false, coins)

    //Reducción3. Pasar la función lambda al final (cuando es el último parámetro)
    //Se puede colocar la expresión lambda después del paréntesis de cierre para llamar a la función

    val trickFunction6 = trickOrTreat6(true, null)

  /*HACER4:LLama 2 veces a la funcion lambda usando las variables que referencia
    cada llamada
            */


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