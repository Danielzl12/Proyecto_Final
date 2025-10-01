// Interfaz que define el comportamiento de carga y descarga de pasajeros.
// Obliga a las clases que la implementen a dar su propia lógica de estos métodos.
public interface Cargar {
    void cargarPasajero();   // Método abstracto para subir pasajeros.
    void descargarPasajero(); // Método abstracto para bajar pasajeros.
}
