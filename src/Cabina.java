// Cabina.java
public class Cabina extends CaracteristicasNoria implements Cargar {
    private int capacidad;
    private int pasajerosActuales = 0;  // cuántos hay dentro
    private int contadorPasajeros = 0;  // para numerarlos (Pasajero 1, 2, 3…)

    public Cabina(int id, String nombre, int capacidad) {
        super(id, nombre);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarInfo() {
        IO.println("La Cabina " + nombre + " con capacidad de " + capacidad + " pasajeros"+
                ". Actualmente tiene: " + pasajerosActuales + " pasajeros");
    }

    @Override
    public void cargarPasajero() {
        if (pasajerosActuales < capacidad) {
            contadorPasajeros++;
            pasajerosActuales++;
            IO.println("Se subió Pasajero " + contadorPasajeros + " a la cabina.");
        } else {
            IO.println("La cabina está llena. No se puede subir más pasajeros.");
        }
    }

    @Override
    public void descargarPasajero() {
        if (pasajerosActuales > 0) {
            IO.println("Un pasajero bajó de la cabina.");
            pasajerosActuales--;
        } else {
            IO.println("La cabina ya está vacía.");
        }
    }
}
