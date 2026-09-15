package curso2_kotlinCompose.unidad1_introduccion_a_kotlin.teoria

/*
Una funcion es un subprograma que realiza una tarea determinada. Esta formada por:
a) Cabecera o firma: fun nombreFuncion(parametros):tipoRetorno
b) Cuerpo:  código que ésta entre { }
 */
fun main() {
    //LLama a la función birthdayGreeting
    birthdayGreeting()

    //LLama a la función birthdayGreeting que retorna un valor
    val message = birthdayGreeting2()
    println(message)

    /*LLama a la función birthdayGreeting3, que recibe un parámetro String
    y retorna un valor*/
    /*a) Paso de argumentos con nombres: la ventaja es que podemos pasarlos en diferente
    orden al indicado por sus parametros en la cabecera de la función*/
    println(birthdayGreeting3(surname="Balsera Quintana",name="Encarna"))
    println(birthdayGreeting3("Encarna","Balsera Quintana"))

    //Llamada a la función birthdayGreeting4, que tiene un parametro predeterminado con el valor (EveryBody)
    birthdayGreeting4()
    birthdayGreeting4("1ºDAM")

}

/*Función que no devuelve nada con return.
 Porque muestra el mensaje directamente a la pantalla
 */
fun birthdayGreeting():Unit {
   println("Happy Birthday (1) !!")
}

/*Función que retorna un mensaje de texto
 */
fun birthdayGreeting2():String {
    val birthdayMessage="Happy Birthday (2)!!"
    return birthdayMessage
}

/*Función que retorna un mensaje de texto
 */
fun birthdayGreeting3(name:String, surname:String):String {
    val birthdayMessage="Happy Birthday, dear $name-$surname (3)!!"
    return birthdayMessage
}

/*Función que no devuelve nada con return.
 Porque muestra el mensaje directamente a la pantalla.
 Y tiene un parametro predeterminado (name): que permite asignar un valor
 cuando no se reciba en la llamada a dicha función
 */
fun birthdayGreeting4(name:String="EveryBody"):Unit {
    println("Happy Birthday $name(1) !!")
}