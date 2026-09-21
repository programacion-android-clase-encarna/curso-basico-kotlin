package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacion_composicion_clases_ejemploSencillo_11_B

class SmartHome (
    private val smartTv: SmartTv,
    private val smartLight: SmartLight) {

    fun turnOnAll(){
        smartTv.turnOn()
        smartLight.turnOn()
    }

    fun turnOffAll(){
        smartTv.turnOff()
        smartLight.turnOff()
    }
}