// La clase Cabina representa un componente específico de la noria.
// Extiende de la clase abstracta CaracteristicasNoria para heredar atributos comunes
// e implementa la interfaz Cargar para obligarse a definir los métodos de carga y descarga.
public class Cabina extends CaracteristicasNoria implements Cargar {
    // Atributo que define la capacidad máxima de pasajeros de la cabina.
    private int capacidad;
    // Atributo que almacena cuántos pasajeros hay actualmente en la cabina.
    private int pasajerosActuales = 0;
    // Contador que nos ayuda a numerar a los pasajeros como "Pasajero 1, 2, 3..."
    private int contadorPasajeros = 0;

    // Constructor de la clase Cabina.
    // Llama al constructor de la clase abstracta con "super" para inicializar id y nombre.
    // Además, inicializa la capacidad máxima de la cabina.
    public Cabina(int id, String nombre, int capacidad) {
        super(id, nombre);
        this.capacidad = capacidad;
    }

    // Método sobrescritura (override) de la clase abstracta CaracteristicasNoria.
    // Aquí implementamos cómo se muestra la información de una cabina concreta.
    @Override
    public void mostrarInfo() {
        IO.println("La Cabina " + nombre + " con capacidad de " + capacidad + " pasajeros"+
                ". Actualmente tiene: " + pasajerosActuales + " pasajeros");
    }

    // Método sobrescrito (override) de la interfaz Cargar.
    // Define el comportamiento de subir pasajeros a la cabina.
    // Aplica una condición para no superar la capacidad máxima establecida.
    @Override
    public void cargarPasajero() {
        if (pasajerosActuales < capacidad) {
            contadorPasajeros++; // Aumenta el número total de pasajeros subidos.
            pasajerosActuales++; // Aumenta la ocupación actual.
            IO.println("Se subió Pasajero " + contadorPasajeros + " a la cabina.");
        } else {
            IO.println("La cabina está llena. No se puede subir más pasajeros.");
        }
    }

    // Método sobrescrito (override) de la interfaz Cargar.
    // Define el comportamiento de bajar pasajeros de la cabina.
    // Aplica una condición para no intentar bajar pasajeros si la cabina está vacía.
    @Override
    public void descargarPasajero() {
        if (pasajerosActuales > 0) {
            IO.println("Un pasajero bajó de la cabina.");
            pasajerosActuales--; // Reduce la ocupación actual.
        } else {
            IO.println("La cabina ya está vacía.");
        }
    }
}
