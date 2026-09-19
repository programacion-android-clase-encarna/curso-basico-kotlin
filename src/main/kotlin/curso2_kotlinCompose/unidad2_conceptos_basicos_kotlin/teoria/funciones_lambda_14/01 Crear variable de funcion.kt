package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main() {
    //Variable (trickFuntion) cuyo valor es una referencia a una funcion (trick)
    val trickFuntion=::trick1

    //Usamos la variable
    trickFuntion()
}

fun trick1(){
    println("No treats")
}