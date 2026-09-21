package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

/*
 Por defecto en Kotlin los tipos de datos son NO anulables, pero podemos usar ?
 para permitir null
 */
fun main() {
    //Variables no nula pero con valor vacio: favoriteActor
    var favoriteActor= "None"  //o "NoBody"  o ""

    //Variable nula (con el valor null)
    var favoriteActor2= null

    println(favoriteActor)
    println(favoriteActor2)

    //Tipos anulables y no nulos
    //Tipos no nulos: String
    var name:String="Maria"
    //name=null  //Error porque name es un tipo que no admite null como valor

    //Solucion para que el tipo String admita null usar ?
    var surname:String?="Barquero Sánchez"
    println(surname)
    surname=null  //Solucionado!!
    println(surname)

    var code:Int?=1  //Declaramos code como nulable
    code=null
    println(code)
}