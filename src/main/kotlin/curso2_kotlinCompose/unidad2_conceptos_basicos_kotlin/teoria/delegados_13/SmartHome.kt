package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.delegados_13

/*
 RELACION HAS-A o de composición
 SmartHome tiene un smartTv y un smartLight
 */
class SmartHome(val smartTvDevice: SmartTvDevice,
                val smartLightDevice: SmartLightDevice) {
    var deviceTurnOnCount=0
        private set

    //MÉTODOS SMART TV
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    //MÉTODOS SMART LIGHT

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    //MÉTODOS PARA APAGAR LOS DOS APARATOS INTELIGENTES
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

}