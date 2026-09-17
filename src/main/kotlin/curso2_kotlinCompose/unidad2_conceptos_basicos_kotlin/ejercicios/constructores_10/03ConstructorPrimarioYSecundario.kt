package curso2_kotlinCompose.unidad2_conceptos_basicos_kotlin.ejercicios.constructores_10

//Con primario + secundarios:
//Para disponer de varias formas de crear objetos
//a) Usando primario: objeto con solo nombre
//b) Usando secundario1: objeto con nombre y edad
//c) Usando secundario2: objeto con nombre, edad y ciudad

data class Persona2(val nombre: String) {
   /*Declara los atributos de los constructores secundarios que no aparecen
    en el primario*/

    constructor(nombre: String, edad: Int) : this(nombre) {
       //Completa

    }

    constructor(nombre: String, edad: Int, ciudad: String) : this(nombre) {
       //Completa
    }
}

fun main(){
   //Declara tres objetos tipo Persona llamando a los distintos constructores
    //Muestra sus atributos de cada objeto
}