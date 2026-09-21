package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacionesEntreClases_11_C

open class SmartDevice protected constructor(val name: String, val category: String) {

    var deviceStatus = "online"
    open var deviceType = "unknown"   //open= permite redefinirla en la subclase
        protected set

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
       // println("Smart device is turned on.")
        this.deviceStatus="on"
    }

    open fun turnOff() {
       // println("Smart device is turned off.")
        this.deviceStatus="off"
    }
}