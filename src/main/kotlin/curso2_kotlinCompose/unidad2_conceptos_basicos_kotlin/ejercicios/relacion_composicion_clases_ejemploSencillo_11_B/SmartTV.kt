package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.relacion_composicion_clases_ejemploSencillo_11_B

class SmartTv(name: String) : SmartDevice(name) {

    override fun turnOn() {

        // Podemos acceder a batteryLevel porque es protected.
        batteryLevel -= 10

        println("$name: TV encendida")
        println("Batería: $batteryLevel%")
    }


    // Esto NO sería posible:
    //
    // println(serialNumber)
    //
    // porque serialNumber es private en SmartDevice.
}