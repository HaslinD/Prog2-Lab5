package haslindavila_.lab5;

public class Lugar {
    private String nombre;
    private String direccion;
    private int nivel;
    private Carretera Inicio;
    private Carretera Salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivel, Carretera Inicio, Carretera Salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel = nivel;
        this.Inicio = Inicio;
        this.Salida = Salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Carretera getInicio() {
        return Inicio;
    }

    public void setInicio(Carretera Inicio) {
        this.Inicio = Inicio;
    }

    public Carretera getSalida() {
        return Salida;
    }

    public void setSalida(Carretera Salida) {
        this.Salida = Salida;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", direccion=" + direccion + ", nivel=" + nivel + ", Inicio=" + Inicio + ", Salida=" + Salida + '}';
    }
    
}
