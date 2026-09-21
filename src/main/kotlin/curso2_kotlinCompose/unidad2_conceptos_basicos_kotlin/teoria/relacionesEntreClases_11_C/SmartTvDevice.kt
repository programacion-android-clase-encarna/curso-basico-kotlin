package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacionesEntreClases_11_C

/*
RELACION DE HERENCIA ENTRE LA SUBCLASE SmartTvDevice y SmartDevice
// Smart TV IS-A smart device.
 */
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override var deviceType = "smart tv"

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    //protected fun nextChannel() {
    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    //Sobreescribir métodos turnOff y turnOn para cambier el comportamiento
    override fun turnOn() {
       // deviceStatus = "on"
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        //deviceStatus = "off"
        super.turnOff()
        println("$name turned off")
    }
}