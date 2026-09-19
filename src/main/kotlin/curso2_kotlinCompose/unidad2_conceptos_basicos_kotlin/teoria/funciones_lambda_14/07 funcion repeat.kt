package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main(){

    val treatFunction7 = trickOrTreat7(false) { "$it quarters"}
    val trickFunction7 = trickOrTreat7(true, null)

    repeat(3)
    {
        treatFunction7()
    }

    repeat(2 ) {
        numero -> trickFunction7 ()
    }


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