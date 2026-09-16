package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

fun main() {
    val trafficLightColor = "Green"
    //Uso de if como expresion (sentencia que genera un valor)
    //Importante: if como expresión requiere la rama else
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow" || trafficLightColor == "Ambar") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Unknown traffic light color"
    println(message)
}