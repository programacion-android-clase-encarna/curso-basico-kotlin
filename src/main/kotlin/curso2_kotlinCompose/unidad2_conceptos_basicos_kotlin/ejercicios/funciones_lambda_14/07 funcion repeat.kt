package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.funciones_lambda_14

fun main(){

    val treatFunction7 = trickOrTreat7(false) { "$it quarters"}
    val trickFunction7 = trickOrTreat7(true, null)

    /*HACER1- Usando la función  repeat llama 3 veces a la función lambda
    referenciada por treatFunction7
    */


    /*HACER1- Usando la función  repeat llama 2 veces a la función lambda
    referenciada por trickFunction7
    */


}

fun trickOrTreat7(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick7
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat7
    }
}

val trick7 ={
    println("No treat")
}
val treat7={
    println("Have a treat")
}