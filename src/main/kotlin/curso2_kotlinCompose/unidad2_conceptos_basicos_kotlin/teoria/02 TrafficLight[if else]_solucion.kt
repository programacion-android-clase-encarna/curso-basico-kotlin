package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

fun main() {
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