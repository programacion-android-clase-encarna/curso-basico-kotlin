package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacionesEntreClases_11

/*
RELACION DE HERENCIA ENTRE LA SUBCLASE SmartLightDevice y SmartDevice
 // Smart Light IS-A smart device.
 */
class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override var deviceType = "smart light"

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
       // deviceStatus = "on"
        super.turnOn()  //super = superclase
        println(
            "$name is turned on. BrightnessLevel is set to $brightnessLevel"
        )
    }

    override fun turnOff() {
       // deviceStatus = "off"
        super.turnOn()
        println("$name turned off")
    }
}