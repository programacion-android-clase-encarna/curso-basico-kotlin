package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

/*
En Kotlin, cuando trabajas con varias ramas,
puedes usar la sentencia when en lugar de if/else,
ya que mejora la legibilidad.
 */
fun main() {
   // var trafficLightColor="Black"
   // var trafficLightColor="Red"
    //var trafficLightColor="Yellow"
   // var trafficLightColor="Amber"
    var trafficLightColor="Green"

    when (trafficLightColor) {
        "Red"-> println("Stop")
        "Yellow","Amber"-> println("Slow")
        "Green"-> println("Go")
        else->println("Invalid traffic-light color")
    }


}