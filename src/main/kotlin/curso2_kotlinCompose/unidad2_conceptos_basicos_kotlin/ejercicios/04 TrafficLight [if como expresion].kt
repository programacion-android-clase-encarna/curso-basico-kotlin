package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios
/* Modifica la estructura if de este ejercicio para que
se comporte como una expresion*/
fun main() {
   //PENDIENTE DE MODIFICAR

    var trafficLight="Black"

    if (trafficLight == "red") {
        println("Stop")
    }else if (trafficLight == "orange") {
        println("Slow")
    }else if (trafficLight == "green") {
        println("Go")
    }else{
        println("Invalid traffic-light color")
    }
}