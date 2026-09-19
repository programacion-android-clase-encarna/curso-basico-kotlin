package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main() {
    //Variable (trickFuntion) cuyo valor es una referencia a una funcion lambda
    val trickFuntion=trick2

    //Usamos la variable
    trickFuntion()
}

//Crear una variable con una funcion lambda
val trick2={
    println("No treats")
}