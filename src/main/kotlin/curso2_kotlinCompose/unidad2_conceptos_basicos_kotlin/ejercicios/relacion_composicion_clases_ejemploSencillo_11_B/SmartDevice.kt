package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.relacion_composicion_clases_ejemploSencillo_11_B

open class SmartDevice(
    val name: String
) {

    // PUBLIC: se puede acceder desde cualquier sitio.
    var status = "offline"

    // PRIVATE: solo se puede utilizar dentro de SmartDevice.
    private var serialNumber = "0000"

    // PROTECTED: se puede utilizar en SmartDevice
    // y también en sus clases hijas.
    protected var batteryLevel = 100


    open fun turnOn() {
        status = "on"
        println("$name encendido")
    }

    open fun turnOff() {
        status = "off"
        println("$name apagado")
    }

    fun showInfo() {
        // Podemos acceder porque estamos dentro de SmartDevice.
        println("Número de serie: $serialNumber")
        println("Batería: $batteryLevel%")
    }
}