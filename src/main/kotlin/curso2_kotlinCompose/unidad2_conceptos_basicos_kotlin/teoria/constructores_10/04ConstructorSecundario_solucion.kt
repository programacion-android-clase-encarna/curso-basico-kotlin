package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.constructores_10

//Y también puedes tener solo constructor secundario:

class Persona3 {
    var nombre:String=""

    constructor(nombre: String) {
        this.nombre=nombre
    }
}

fun main(){
    val p= Persona3("Maria")
    println("${p.nombre}")
}