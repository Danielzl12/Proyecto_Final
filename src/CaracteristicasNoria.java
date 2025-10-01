// Clase abstracta que define características comunes de los elementos de la noria.
// Se usa como "plantilla" que no puede instanciarse directamente.
public abstract class CaracteristicasNoria {
    // Identificador de la noria.
    protected int id;
    // Nombre del componente (ejemplo: "Cabina A").
    protected String nombre;

    // Constructor para inicializar los atributos comunes.
    public CaracteristicasNoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Método getter para obtener el id del componente.
    public int getId() {
        return id;
    }

    // Método getter para obtener el nombre del componente.
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que obliga a las subclases a implementar
    // cómo mostrar su información específica.
    public abstract void mostrarInfo();
}
