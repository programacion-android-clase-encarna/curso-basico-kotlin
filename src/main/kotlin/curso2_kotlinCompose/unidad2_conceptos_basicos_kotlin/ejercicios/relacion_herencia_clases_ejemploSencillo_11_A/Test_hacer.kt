package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.relacion_herencia_clases_ejemploSencillo_11_A


/*
* Crea una variable polimorfica llamada 'device' que
* primero guarde un objeto de tipo SmartTv
* y despues se comporte como un SmartLight
* Recuerda que debes declarar la variable del tipo padre SmartDevice
*
*
* Previamente debes crear la siguiente jerarquia de clases:
* SmartDevice (name)  --> clase padre
* Otros atributos: status, serialNumber, bateryLevel
* Métodos: turnOn  y turnOff para encender y apagar el device
*
* SmartLight  y SmartTV  --> clases hijas
* Método sobreescrito: turnOn para que consuma bateryLevel
*
*
* */
fun main() {

    //Crea la variable polimorfica y llama a sus métodos y atributos públicos


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