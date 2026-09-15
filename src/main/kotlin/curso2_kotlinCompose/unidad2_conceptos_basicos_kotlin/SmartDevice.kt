package curso2_basicoAndroidKotlinCompose.unidad2

/* Creación clase SmartDevice
*  con constructor principal y secundario con parámetros
*
*  Atención: speakerVolumen no se pasa como parámetro
* Tiene 2 como valor predeterminado y se puede modificar usando la funcion set
* */
class SmartDevice(val name: String, val category: String) {

    var deviceState = "online"

    /* Si definimos un atributo con var se crean automáticamente
     * sus métodos get() y set() */
    var speakerVolumen = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    constructor(
        name: String,
        category: String,
        deviceStateCode: Int
    ) : this(name, category) {

        deviceState = when (deviceStateCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart Device is turned on")
    }

    fun turnOff() {
        println("Smart Device is turned off")
    }

}
fun main() {

    //Creación objeto de tipo SmartDevice y llamada a sus métodos
    val smartDeviceTV1 = SmartDevice("Android TV", "Entertainment")

    val smartDeviceTV2 = SmartDevice("Android TV", "Entertainment", 0)

    println(smartDeviceTV1.deviceState) // online
    println(smartDeviceTV2.deviceState) // offline

    //Acceso a un atributo del objeto
    println("Name SmartDevice: ${smartDeviceTV1.name}")

      //Llamada a método get
      println("speakerVolumen: ${smartDeviceTV1.speakerVolumen}")

      //Llamada a método set
      smartDeviceTV1.speakerVolumen=100

      smartDeviceTV1.turnOn()
      smartDeviceTV1.turnOff()

      //Llamada a método get
      println("speakerVolumen: ${smartDeviceTV1.speakerVolumen}")


}