package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.teoria.constructores_10

//Con primario + secundarios:
//Para disponer de varias formas de crear objetos
//a) Usando primario: objeto con solo nombre
//b) Usando secundario1: objeto con nombre y edad
//c) Usando secundario2: objeto con nombre, edad y ciudad

data class Persona2(val nombre: String) {
    var edad: Int=0
    var ciudad:String=""

    constructor(nombre: String, edad: Int) : this(nombre) {
        this.edad=edad

    }

    constructor(nombre: String, edad: Int, ciudad: String) : this(nombre) {
        this.edad=edad
        this.ciudad=ciudad
    }
}

fun main(){
    val p1=Persona2("Ana")
    val p2=Persona2("Ana",20)
    val p3= Persona2("Ana",20,"Don Benito")

    println("${p1.nombre} ${p1.edad} ${p1.ciudad}")
    println("${p2.nombre} ${p2.edad} ${p2.ciudad}")
    println("${p3.nombre} ${p3.edad} ${p3.ciudad}")
}