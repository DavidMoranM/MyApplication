package example.health.quo.myapplication;

/**
 * Created by davidmoranmartin on 5/12/16.
 */

public class TeoriaCleanArquitecture {

    /*

    - Clean Arquitecture: Se divide en 3 capas: Data (datos, bds, request), Domain (lógica de negocio) y Presenters (vistas y lógicas de vistas).
    - Clean Arquitecture: Garantiza el uso de CleanCode, los principios SOLID.
    - Data y Domain se interrelacionan mediante una Interfaz.
    - Dentro de Presenter tenemos MVP - Model View Presenter - (la vistas por un lado -View-, la parte lógica de las vistas por otro -Presenter-)
    - La idea es tener el código separado por capas. Queremos reutilizarlo todx lo posible.
    - Dependency Rule :"El código fuente sólo puede apuntar hacia dentro"
    - Interactors -> Casos de uso -> Una secuencia de interacciones que se encargan de modelar alguna acción que quiero que mi soft realice.
    - Inyección de dependencias con Dagger 2 -> @Inject

     */
}
