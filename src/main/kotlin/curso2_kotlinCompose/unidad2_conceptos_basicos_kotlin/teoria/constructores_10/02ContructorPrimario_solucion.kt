package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.constructores_10

//Por ejemplo, con solo constructor primario
//Es totalmente válido. No necesita constructor secundario.
//Es la forma más habitual y sencilla de definir una clase en Kotlin.

class Persona(val nombre: String, val edad: Int){

}

fun main(){
    val persona = Persona("Ana", 25)
    println("${persona.nombre} ${persona.edad}")
}