package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14
/*
  Los parametros que acepta o devuelve una función lambda
  son necesarios declararlos con su tipo de datos
 */
fun main () {
    treat3_1()
    treat3_2()
    trick3_3()

}

//variable con función lambda que no acepta ni devuelve nada
//Es otra forma de declarar una función
val treat3_1={
    println("Have a treat")
}
//Igual que treat pero especificando
// el tipo de los parámetros de la función lambda
val treat3_2:()->Unit={
    println("Have a treat")
}
//Otra variable con función lambda
val trick3_3={
    println("No treats")
}