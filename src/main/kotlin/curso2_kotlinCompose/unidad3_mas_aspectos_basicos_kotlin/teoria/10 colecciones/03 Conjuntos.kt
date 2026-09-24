package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`10 colecciones`
/*
Un conjunto o set es una estructura de datos que guarda elementos
sin duplicados, del mismo tipo pero desordenados.

Tipos: no mutable - función setOf()  y mutable - función mutableSetOf()
 */
fun main(){
    //set_no_mutable()
    set_mutable()
}

private fun set_no_mutable() {
    //Crear un conjunto no mutable
    val solarSystem = setOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    for (planet in solarSystem) {
        println(planet)
    }
}

private fun set_mutable() {
    //Crear un conjunto no mutable
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")


    //Eliminar elemento
    solarSystem.remove("Mercury")

    //Añadir elemento
    solarSystem.add("Pluto")

    for (planet in solarSystem) {
        println(planet)
    }
}