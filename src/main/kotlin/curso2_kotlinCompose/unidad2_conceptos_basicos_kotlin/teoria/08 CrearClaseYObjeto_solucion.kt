package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

/*
Crea una clase llamada SmartDevice con un atributo name y los métodos
turnOn y turnOff

Después dentro de la función main crea un objeto de esa clase y accede a su
atributo y a sus dos métodos, que imprimen un mensaje por pantalla.
 */

class SmartDevice{
    val name="Android TV"

    fun turnOn(){
        println("$name is On")
    }

    fun turnOff(){
        println("$name is Off")
    }
}

fun main(){
    val mySmartDevice= SmartDevice()

    println("Name: ${mySmartDevice.name}")
    mySmartDevice.turnOn()
    mySmartDevice.turnOff()

}