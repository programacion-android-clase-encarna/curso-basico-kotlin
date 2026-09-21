package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacionesEntreClases_11_C

/*
 Prueba:
 - Crear un objeto polimorfico: smartDevice (al principio es una TV y luego una light inteligente)
 - Relacion de herecia (polimorfismo)
 - Relacion de composición
 - Uso de this / super
 - Sobreescribir un atributo o método heredado en una subclase = anular atributo o método
 de la clase padre en la subclase   --> override
 */
fun main() {

    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()
    println("${smartDevice.deviceType}")

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
    println("${smartDevice.deviceType}")


}
