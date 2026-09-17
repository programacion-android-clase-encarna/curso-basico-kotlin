package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria

/*
* Una variable mutable puede modificar su valor a traves del
* método set y leerlo con get.
* Echa un vistazo a la estructura
* */

class SmartDevice2{
    var speakerVolumen=2
        get()=field   //field=campo copia de seguridad
        set(value){
           // if (value in 1 .. 100)
            field=value
        }
}

fun main(){
    val mySmartDevice= SmartDevice2()
    println(mySmartDevice.speakerVolumen)
    mySmartDevice.speakerVolumen=3
    println(mySmartDevice.speakerVolumen)

}