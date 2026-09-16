package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios
/* Modifica la estructura when de este ejercicio para que
se comporte como una expresion*/
fun main() {
    //PENDIENTE DE MODIFICAR
    var trafficLightColor="Green"

    when (trafficLightColor) {
        "Red"-> println("Stop")
        "Yellow","Amber"-> println("Slow")
        "Green"-> println("Go")
        else->println("Invalid traffic-light color")
    }
}