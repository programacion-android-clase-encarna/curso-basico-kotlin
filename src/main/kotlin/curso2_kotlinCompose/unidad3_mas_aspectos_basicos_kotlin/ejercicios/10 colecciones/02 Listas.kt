package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.ejercicios.`10 colecciones`

/*
Una lista es una array redimensionable, es decir que puede
cambiar su tamaño.
Las listas pueden ser de solo lectura - función listOf() o mutables - función mutableListOf()
 */
fun main(){

   // ejemplo1_lista_no_mutable()
    ejemplo2_lista_mutable()


}

fun ejemplo2_lista_mutable() {
    //Definir una lista no mutable usando la función listOf()
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    //Añadir un nuevo planeta al final de la lista usando el método add
     //HACER_1

    //Añadir un nuevo planeta en la posición 3 usando el método add
    //HACER_2

    for (planet in solarSystem){
        println(planet)
    }

    //Actualizar el planeta de la posicion 3 a "Future Moon" usando []
   //HACER_3

    //Muestra ahora el contenido de la posición 3
    //HACER_4

    //Eliminar un elemento de una posicion (3) usando el método removeAt(indice)
    //HACER_5

    //Eliminar un elemento a partir de su nombre, por ejemplo elimina el planeta "Earth"
    //HACER_6

    //Comprobar si existe un elemento a partir de su nombre usando el método contains(elemento)
    //HACER_6

    //Otra forma de comprobar la existencia de un elemento
    println("Future Moon" in solarSystem)
}

private fun ejemplo1_lista_no_mutable() {
    //Definir una lista no mutable usando la función listOf()
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println("Total solar planets: ${solarSystem.size}")
    //a) Recorrer con un for usando indices
    /*for (i in solarSystem.indices ){
        println(solarSystem[i])
    }*/
    //b) Recorrer con un for los elementos (planets)
    for (planet in solarSystem) {
        println(planet)
    }
}