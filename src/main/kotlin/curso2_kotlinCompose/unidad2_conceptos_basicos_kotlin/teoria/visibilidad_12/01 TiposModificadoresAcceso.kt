package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.visibilidad_12

/*
Accesibilidad en atributos:
Java	                                     Kotlin
package-private	                             No existe como tal
Acceso dentro del mismo package	            internal → acceso dentro del mismo módulo
private	                                    private
protected	                                protected
public	                                    public

Accesibilidad en métodos-constructores y clases kotlin:
private, protected, internal (modulo), public(todo el proyecto)

--
public    → visible desde cualquier lugar
internal  → visible dentro del mismo módulo
protected → visible en la clase y sus subclases
private   → visible solo dentro del contexto donde se declara

 */

fun main(){
    /*Ejercicio: Mira el uso de los modificadores en atributos:

    protected en la función set() de la propiedad deviceStatus en la clase SmartDevice
    private en la funcion set() de la nueva propiedad deviceTurnOnCount en la clase SmartHome

Y en métodos:

   protected fun nextChannel() de la clase SmartTvDevice
   constructor primario de la clase SmartDevice

     */
}