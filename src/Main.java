
void main() {
    Cabina cabina = new Cabina(1, "A", 3);

    cabina.mostrarInfo();
    cabina.cargarPasajero();
    cabina.cargarPasajero(); // aquí debería decir que está llena

    cabina.mostrarInfo();
    cabina.descargarPasajero();
    cabina.descargarPasajero(); // aquí debería decir que está vacía

    cabina.mostrarInfo();
}
