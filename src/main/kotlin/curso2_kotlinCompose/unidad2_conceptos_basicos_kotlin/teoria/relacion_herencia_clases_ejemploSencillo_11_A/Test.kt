package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.relacion_herencia_clases_ejemploSencillo_11_A

fun main() {

    // POLIMORFISMO
    var device: SmartDevice = SmartTv("Samsung")

    device.turnOn()

    // Podemos acceder a una propiedad pública.
    println(device.status)

    // Podemos llamar a un método público.
    device.showInfo()


    println("-----")


    // La misma variable ahora contiene
    // un objeto de otra clase hija.
    device = SmartLight("Salón")

    device.turnOn()

    println(device.status)
    device.showInfo()


    // Desde aquí NO podemos acceder a:
    //
    // device.batteryLevel
    // ❌ protected
    //
    // device.serialNumber
    // ❌ private
    //
    // Porque estamos fuera de SmartDevice
    // y de sus clases hijas.
}