package curso1_tourWelcome/*Colecciones: estructuras de datos para agrupar información para
su posterior procesamiento
 Lists o listas: colección ordenada de elementos
 Sets o conjuntos: colección desordenada de elementos
 Maps o mapas: colección de pares (clave-valor), donde
 las claves son únicas y cada una está asociada a un único valor
 */

fun main(){
  //  curso1.lista_1()
  //  curso1.lista_mutable_2()
    //curso1.convertir_lista_mutable_a_nomutable_3()

   // curso1.set_4()
   // curso1.set_mutable_5()

   // curso1.mapa_6()
    //curso1.mapa_mutable_7()
    mapa_recorrer_8()
}

fun mapa_recorrer_8() {
   val mapa = mapOf("Ana" to 9,"Andrés" to 8, "José" to 10)
   println("Keys(alumnos):")
    println(mapa.keys)
    println("Values(notas):")
    println(mapa.values)
    println("Entradas (key + value):")
    println(mapa.entries)
    //Recorrer el mapa para mostrar cada par de entrada (clave-valor)
    for (key in mapa.keys){
        println("${key} tiene de nota : ${mapa.get(key)}")
    }
}

fun mapa_mutable_7() {
    //Mapa mutable
    val mapa_mutable:MutableMap<String,Int> = mutableMapOf("apple" to 100,"kiwi" to 190, "orange" to 100)
    println("Mapa mutable:")
    println(mapa_mutable)
    mapa_mutable.put("banana",200)
    println(mapa_mutable)


}

fun mapa_6() {
    //Mapa de solo lectura
    val mapa:Map<String,Int> = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("Mapa de solo lectura:")
    println(mapa)
}

fun set_mutable_5(){
val conjunto:MutableSet<Int> = mutableSetOf(1,2,3,4)
    conjunto.add(1) //Se se añade porque no admite repetidos
    conjunto.add(5)
    println("Conjunto mutable:")
    println(conjunto)
}

fun set_4() {
  val conjunto= setOf(1,2,3,4)
   println("Conjunto de enteros (solo lectura):")
    println(conjunto)
}

fun convertir_lista_mutable_a_nomutable_3() {
    //Haciendo un casting conseguimos convertir una lista mutable
    // a otra bloqueada o de solo lectura
    val lista_mutable:MutableList<String> = mutableListOf("triangulo","cuadrado","circulo")
    val lista_no_mutable:List<String> = lista_mutable //casting

    println("Primer elemento lista: ${lista_no_mutable.first()}")
    println("Último elemento lista: ${lista_no_mutable.last()}")

}

fun lista_mutable_2() {
    var lista:MutableList<String> = mutableListOf("triangulo","cuadrado","circulo")
lista.add("pentagono")

    println("Lista mutable:")
    println(lista)
    println("Lista mutable con el triangulo eliminado:")
    lista.remove("triangulo")
    println(lista)
}

fun lista_1() {
    //lista de solo lectura o no mutable (sin declarar el tipo)
    //val lista= listOf("triangulo","cuadrado","circulo")

    //lista de solo lectura o no mutable (declarando su tipo)
    val lista:List<String> = listOf("triangulo","cuadrado","circulo")

    println("Lista no mutable:")
    println(lista)
    println()

}

