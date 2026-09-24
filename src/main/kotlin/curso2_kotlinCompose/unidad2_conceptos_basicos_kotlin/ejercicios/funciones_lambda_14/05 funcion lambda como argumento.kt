package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.funciones_lambda_14

fun main(){
    //Funcion lambda asignada a una variable
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    /*HACER1: crear una variable treatFunction que
     referencia a la funcion lambda trickOrTreat(false, coins)
     */

    /*HACER2: crear una variable trickFunction que
     referencia a la funcion lambda trickOrTreat(true, null)
     */

    //HACER3: LLama una vez a las funciones lambda
// a traves de sus variables

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