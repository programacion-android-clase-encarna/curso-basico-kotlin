package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`10 colecciones`

/*
Un Map es una colección que consta de claves y valores.
Se llama un mapa porque las claves únicas se asignan a otros valores.
Una clave y su valor complementario suelen llamarse key-value pair.

Un Map o mapa es similar a un Set o conjunto pero guarda pares de elementos (key-value)

Acceder a un valor desde un mapa por su clave suele ser más rápido
que realizar una búsqueda en una lista grande, como con indexOf().

Los mapas se pueden declarar con las funciones mapOf() o mutableMapOf().

 */
fun main() {
    ejemplo1_mapa_mutable()
    //ejemplo2_mapa_no_mutable()


}

fun ejemplo2_mapa_no_mutable() {
    val solarSystem = mapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    //Mostrar el valor de la clave="Earth"
    //println("Moons of Earth="+ solarSystem.get("Earth"))
    println("Moons of Earth= ${solarSystem.get("Earth")}")

    //Modificar el valor de una clave: error no es mutable
    // solarSystem.set("Pluto",5)

    //Eliminar un par a partir de su clave: error no es mutable
    //solarSystem.remove("Mars")

    //Listar pares (clave-valor) del mapa
    for ((planet, moons) in solarSystem) {
        println("$planet has $moons moons")
    }
}

fun ejemplo1_mapa_mutable() {
    /*Los tipos clave y valor pueden ser inferidos o deducidos
    por el compilador  de kotlin: */
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    //Mostrar el valor de la clave="Earth"
    //println("Moons of Earth="+ solarSystem.get("Earth"))
    println("Moons of Earth= ${solarSystem.get("Earth")}")

    //Modificar el valor de una clave
    solarSystem.set("Pluto", 5)

    //Eliminar un par a partir de su clave
    solarSystem.remove("Mars")

    //Listar pares (clave-valor) del mapa
    for ((planet, moons) in solarSystem) {
        println("$planet has $moons moons")
    }

}
