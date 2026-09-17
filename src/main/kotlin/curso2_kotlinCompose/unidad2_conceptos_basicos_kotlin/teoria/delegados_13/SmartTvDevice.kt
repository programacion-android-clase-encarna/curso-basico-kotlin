package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.delegados_13

/*
RELACION DE HERENCIA ENTRE LA SUBCLASE SmartTvDevice y SmartDevice
// Smart TV IS-A smart device.
 */
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override var deviceType = "smart tv"

    //Crear atributo y su set sin delegado
    /*var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }*/

    //Crear atributo y su set con el delegado RangeRegulator
    private var speakerVolume by RangeRegulator(2,0,100)

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

    protected fun nextChannel() {
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