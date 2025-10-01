// ComponenteNoria.java
public abstract class ComponenteNoria {
    protected int id;
    protected String nombre;

    public ComponenteNoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }



    public abstract void mostrarInfo();
}
