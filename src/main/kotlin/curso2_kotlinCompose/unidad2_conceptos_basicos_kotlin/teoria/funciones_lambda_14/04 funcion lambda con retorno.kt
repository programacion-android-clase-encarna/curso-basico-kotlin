package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.funciones_lambda_14

fun main(){
    val treatFunction4=trickOrTreat4(false)
    val trickFunction4=trickOrTreat4(true)

    //LLama a las funciones
    treatFunction4()
    trickFunction4()

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
