package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

fun main() {
    var favoriteActor: String? = "Dustin Hoffman"
    // println(favoriteActor.length)
    /* Error: porque puede ser null y no se puede llamar a un método sobre
     un objeto nulo (null.length)*/

    /*Soluciones:

    a) No declarar la variable como anulable
    b) Declararla como anulable pero llamar al método con el operador de llamada segura (?.)
    c) Declararla como anulable pero llamar al método con el operador de aserción no nulo de !!
    d) Declararla como anulable y usar if/else como condicion != null
    e) Declararla como anulable y usar operador Elvis (?:) con el de llamada segura (?.)
     */

    /*Solución b): Solo si no es nula la variable llama al método length */
    //println("Solucion b usando operador de llamada segura ?. : "favoriteActor?.length)

    /*Solución c), usando el operador !! que tiene el incoveniente que provocar la excepción
    * NullPointerException cuando la variable tiene el valor null*/
    /* favoriteActor=null
     println("Solucion c usando el operador !!: "+favoriteActor!!.length)*/

    /*Solución d)*/
    if (favoriteActor != null) {
        println("Solucion d usando if !=null como sentencia: "+favoriteActor.length)
    } else {
        println("Es nulo")
    }

    /*Solucion d) Usando if como expresión*/
    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println("Solucion d usando if !=null como expresión: "+lengthOfName)

    /*Solucion e) Usando operador Elvis ?: con  operador de llamada segura ?.*/
    val lengthOfName2= favoriteActor?.length ?: 0
    println("Solucion e: "+lengthOfName2)

}