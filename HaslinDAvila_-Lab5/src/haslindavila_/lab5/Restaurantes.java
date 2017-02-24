package haslindavila_.lab5;

public class Restaurantes extends Lugar{
    private String categoria;
    private int calificacion;

    public Restaurantes() {
        super();
    }

    public Restaurantes(String categoria, int calificacion, String nombre, String direccion, int nivel, Carretera Inicio, Carretera Salida) {
        super(nombre, direccion, nivel, Inicio, Salida);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "categoria=" + categoria + ", calificacion=" + calificacion + '}';
    }
    
    
}
