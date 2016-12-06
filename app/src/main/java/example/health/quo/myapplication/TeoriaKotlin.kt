package example.health.quo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TeoriaKotlin : AppCompatActivity() {

    /*

  Teoría básica Kotlin:

   - Kotlin es una lenguaje de programación conciso, seguro y con tipos estáticos centrado en la interoperabilidad con Java.
   - Lenguaje de programación funcional: Basada en funciones. Se trata de REDUCIR lo más posible.
   - Mejora y simplifica java. Funciona en la JVM. Orientado a objetos, pero con caracterísitcas de leng. funcional.
   - Creado por JetBrain (IntelliJ)
   - "El swift de Android".
   - Simple, ligero e interoperable. Mucho menos verboso. La librería es muy pequeña.
   - Fuermente tipado.
   - Inferencia de tipos: No olbigado a declarar el tipo, comprobación automática.

   - Ya no hace falta declarar las variables (los IDs). Más simple aún que ButterKnife.
   - Aplicar las menos líneas posibles.
   - Alineación alt+cmd+l
   - //Ctrl Intro (para getters y setters)
   - Ya no _ en la declaración de variables, sino minúscula-mayúsculas
   - VAL es un final!!! Si no quieres "final" VAR
   - La clase de Kotlin no se tiene porque llamar igual que el fichero. Motivo: Puede haber funciones y clases sueltas por doquier.
   - Mucha facilidad al crear interelación entre Kotlin y Java
   - Importante "properties" (propiedades)
   - Poner Any?, significa que es compatible con nulos.
   - Diseñado para tratar de evitar todos los nullpointerexcepcion posible
   - Si es null ? hará algo, sino no hará nada. Si es !! (que siga adelante aunque sea null)
   - data class -> Específica para datos.
   - Los getters y setter se mapean automáticamente

   - Para la asychrony en java es AsyncTask
   - Librería Anko para asincronía. Muy fácil asynchrony. Para intents
   - Extension functions
   - No es funcional al 100% pero tiene muchas caract de un lenguaje funcional.
   - Lamdas-> Una forma de especificar una función como si fuera un tipo. funcion(T) -> R
   - Callback -> Una función que se pasa por parámetro a otra función


  */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
}
