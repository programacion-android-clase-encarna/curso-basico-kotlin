package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

fun main() {
    //val trafficLightColor = "Green"
    val trafficLightColor = "Ambar"

    //Uso de when como expresion (sentencia que genera un valor)
    //Importante: when como expresión requiere la rama else
    val message =
        when (trafficLightColor) {
            "Red"->"Stop"
            "Yellow","Ambar"->"Slow"
            "Green"->"Go"
            else -> "Unknown traffic light color"
        }
    println(message)
}