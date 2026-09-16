package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria
/*
  El resultado es vacio porque falta una rama else
 */
fun main() {
    var trafficLight="Black"

    if (trafficLight == "red") {
        println("Stop")
    }else if (trafficLight == "orange") {
        println("Slow")
    }else if (trafficLight == "green") {
        println("Go")
    }
}