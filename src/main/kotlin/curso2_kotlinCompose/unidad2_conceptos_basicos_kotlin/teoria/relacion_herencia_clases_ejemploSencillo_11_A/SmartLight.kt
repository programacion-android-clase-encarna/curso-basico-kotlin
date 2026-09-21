package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacion_herencia_clases_ejemploSencillo_11_A

class SmartLight(name: String) : SmartDevice(name) {

    override fun turnOn() {

        // También podemos acceder a una propiedad protected
        // desde otra clase hija.
        batteryLevel -= 5

        println("$name: luz encendida")
        println("Batería: $batteryLevel%")
    }
}