package example.health.quo.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class BasicoKotlin : AppCompatActivity() {

    /*
    1. Constantes
    2. Variables
    3. Comprobación del null
    4. Sentencias de control (If y For y recorridos)
    5. Cadena e impresión
    6. Objetos
    7. Listas
    8. Constructores
    9. Funciones
    10.Asignación de vistas (View Binding)

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            //1. Constantes
            val ejemplo = 2
            val X = "Holhha"


            //2. Variables
            var x = "Ejemplo"
            x = "Otro ejemplo"
            var y = 5

            /*

     fun main(args: Array<String>){
        println("Hola mundo desde Kotlin")
     }

     */

            Toast.makeText(this@BasicoKotlin, "Hello " + X.substring(2), Toast.LENGTH_SHORT).show()
            Toast.makeText(this@BasicoKotlin, "Hello2 ${y}", Toast.LENGTH_SHORT).show()


            //3. Comprobación de null
            //?  -> Comprueba si es Null. Nos ahorramos tener que hacer el típico "if... null...."
            //Donde veo el print
            print(X.substring(2))
            print("Esto no es una cadena nula ${X.substring(2)}") //Metiendo entre llaves se imprimen las cadenas

            //!! -> Se ejecutará sí o sí, aunque sea Null
            print(X.substring(2))


            //4. Sentencias de control
            //IF
            if (y < 10) {
                print("La variable y es menor que 10")
            } else {
                print("La variable c es mayor que 10")
            }

            //IF Simplificada
            val value = if (y > 10) 5
            else 3

            when (value) {
                5       -> "5"
                6       -> "6"
                in 3..7 -> "3..4"
                is Int  -> "Int"
                else    -> "Default" //es el default de java
            }

            //Otro if (que devuelve un valor si está entre un rango de dos valores)
            val n = 8
            if (n in 2..30) {
                println("n está entre 1 y 30")
            }


            //FOR
            for (c in "sdsd") {
                println(c)
            }

            val listaFor = listOf("string1", "string 2", "string 3", "String 4")

            for (value in listaFor) {
                println(value)
            }

            //Para recorreder solo 2 los primeros sería:
            for (listaFor in 0..2) {
                println(value)
            }

            //Incrementador dentro de 2 rangos. Para recorrer de 2 en 2:
            for (value in 1..5 step 2) {
                println(value)
            }


            //5. Cadenas. Y su impresión
            //Sustitución de "+"
            val result = "Result"
            println("Result " + result)
            println("Result ${result.substring(5)} ${result.substring(2)} este es mi perfil")

            //Imprimir distintas líneas con el "println" y con el +


            //6. Objetos
            //Llamar a la case File
            val file = File("")

            //Llamar a una clase propia
            val kotlinJava = KotlinWithJava("Esto es un objeto Java")
            println("Voy a imprimir el objeto java ${kotlinJava.test}")


            val objectKoltlin = ExampleClass("Nombre", "Apellido")
            println("Esto es un objeto kotlin ${objectKoltlin}")

            //Llamadas a funciones
            println(suma(2, 3))
            println(suma2(3, 5))

            //Función que puede llamar a cualquier objeto (any)
            cases(1)
            cases(1201200102)
            cases("esa es una cadena de texto")

            //7. Listas (un arrayList dentro de java)
            val list = listOf<Int>(1,2,3) //Lista de enteros
            val listDos = listOf(1,2,3)
            val set = setOf<String>("hola", "adiós")
            val setDos = setOf("Hola", "Adios")
            val listString = listOf<String>("Hola", "Muy buenas") //Lista vacía de String
            val listSort = emptyList<String>()


            val mapCompleto = mapOf<Int, String>(
                    1 to "value",
                    2 to "value2"
            )

            val mapSimple = mapOf(
                    1 to "value",
                    2 to "value2"
            )

            for ((key, value) in mapSimple){
                println("jey $key{} esto es continuación de la key")
            }

            for (element in list){
                println("El elemento es: ${element}")
            }

            for (element in 1..5 step 1){
                println("holap")
            }
        }

    }

    //8. Constructores en Kotlin
    class ExampleClass(val name: String, val lastName: String)

    //Ejemplo de constructor
    class Person(firstName: String)

    //9. Funciones
    // Devuelve un return
    fun maxNum(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
        saludarDos()
    }

    //Misma función mucho más reducida
    fun max(a: Int, b: Int) = if (a > b) a else b

    //Otro ejemplo con return
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    //Mismo ejemplo sin necesidad de uasr return
    fun suma2(a: Int, b: Int) = a + b

    //Función Vacía (void) SIN RETURN (Unit)
    fun saludar(): Unit {
        println("hola")
    }

    //Lo mismo sin Unit
    fun saludarDos() {
        println("hola")
        var mmmm = myFun()
        var mmmm2 = myFunDos(param2 = "bla", param = "bla", param3 = 3) //Puede cambiar el orden de los parámetros
        var mmmm3 = myFunDos("bla","bla",2)
        println("El valor de la variable es: ${mmmm}")
    }

    //Función + concatenación de cadenas
    fun template(dato: Int) {
        println("el dato es ${dato}")
    }

    //¿Qué hace esto? lo de unit tenía que ver con null?
    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }

    //Contruscción que no existe en java.
    //Any puede ser un objeto de cualquier tipo
    //y el switch case recibo peude recibir datos de cualquier tipo
    fun cases(obj: Any) {
        when (obj) {
            1          -> print("uno")
            "Hola"     -> print("saludo")
            is Long    -> print("long")
            !is String -> print("no es una cadena")
            else       -> print("Desconocido")
        }
    }

    //Más funciones!!
    //Más entendibles y declarativas que en java
    fun myFun(): String{
        println("Esta es mi función")
        return "Esto es lo que devuelve"
    }

    fun myFunDos(param: String, param2: String, param3: Int): String{
        println("Esta es mi función")
        return "Esto es lo que devuelve"
    }

    //FUNCIÓN QUE NUNCA PUEDA DEVOLVER NULL
    fun myFunTres(param: String, param2: String, param3: Int): String?{
        println("Esta es mi función")
        return null
    }

    //AMBAS HACEN LO MISMO
    fun fun2(param1: Int, param2: Int): String{
        return "MyResult"
    }

    fun fun2(param1:String, param2: String) = "MyResult"

    //LEER UNA LÍNEA
    fun myReadLine(): String?{
        val line= readLine()
        return if(line.isNullOrEmpty()) null else line
    }

    //10. Asignación de vistas (View Binding)
    val recyclerView by lazy {
        findViewById(R.id.button) as Button
    }
    //Esto se podría hacer con Extensions
    //Mejor usar Extensions

    //Extension functions con Picasso
    /*
    fun ImageView.loadUrl(url: String){
        Picasso.with(context).load(url).into(this)
    }


    */


}
