package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacion_composicion_clases_ejemploSencillo_11_B

fun main(){
    val smartHome=
        SmartHome(SmartTv("Samsung"), SmartLight("Salón"))

    smartHome.turnOnAll()
    smartHome.turnOffAll()
}