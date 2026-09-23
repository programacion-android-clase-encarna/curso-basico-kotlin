package curso2_kotlinCompose.unidad3_mas_aspectos_basicos_kotlin.teoria.`10 colecciones`

/*
Un array es una estructura de datos que almacena un conjunto aleatorio
de datos del mismo tipo y en un orden.
Se accede a un elemento por su posición o indice.
Tiene un tamaño fijo (que impide redimensionarla).
 */
fun main(){
    //val rockPlanets=arrayOf<String>("Mercury","Venus","Earth","Mars")
    //Es también válido no declarar el tipo del arrayOf
    val rockPlanets=arrayOf("Mercury","Venus","Earth","Mars")

    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    //Usando el operador + puedes unir arrays
    val solarSystem=rockPlanets+gasPlanets

    println("RockPlanets=${rockPlanets.contentToString()}")
    println("GasPlanets=${gasPlanets.contentToString()}")
    println("SolarPlanets=${solarSystem.contentToString()}")

}