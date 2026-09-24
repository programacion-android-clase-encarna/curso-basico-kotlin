package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.funciones_lambda_14

fun main(){
    /*HACER1: crear una variable treatFunction4 que
    referencia a la funcion lambda trickOrTreat4(false)
    */

    /*HACER2: crear una variable trickFunction4 que
     referencia a la funcion lambda trickOrTreat4(true)
     */

    //HACER3: LLama una vez a las funciones lambda
// a traves de sus variables


}

//Función que retorna una función lambda
fun trickOrTreat4(isTrick: Boolean): ()->Unit{
    if (isTrick){
        return trick4
    }else{
        return treat4
    }
}

val trick4={
    println("No treats!")
}

val treat4={
    println("Have a treat!")
}
