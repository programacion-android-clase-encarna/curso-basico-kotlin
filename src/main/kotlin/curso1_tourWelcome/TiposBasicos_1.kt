package curso1_tourWelcome

fun main(){
   // curso1.mostrar_mensaje_1()
    tipos_variables_2()
   // curso1.plantilla_string_3()
   // curso1.operaciones_aritmeticas_4()
    //curso1.tipos_propios_de_kotlin_5()
    //curso1.error_sin_inicializar_variable_6()

}

fun error_sin_inicializar_variable_6() {
   /*val variable:Int
   println(variable)*/
}

fun tipos_propios_de_kotlin_5() {
   println("Any: es el tipo base de clualquier clase de kotlin")
    println("Nothing: ningún valor. Se usa en funciones para indicar que no retorna nada")
println("Unit: objeto unidad, equivale a void en Java")
}

fun operaciones_aritmeticas_4() {
    var clientes = 10
    clientes = 8
    clientes=clientes+3
    println(clientes)

}

fun plantilla_string_3() {
    /*clientes es reconocido o inferido de tipo int
     aunque no haya sido declado gracias al valor en este
     caso 10 que es un entero
    */
    val clientes=10
    println("Clientes: $clientes")
    println("Clientes: ${clientes+1}")
}

private fun mostrar_mensaje_1() {
    print("Hola Mundo")
}

private fun tipos_variables_2() {
    val n = 5;//variable inmutable
    var contador = 0;//variable mutable
    val numero_largo=1_000_000  //1 millón

    println(n)
    contador++
    println(contador)
    println(numero_largo)
}