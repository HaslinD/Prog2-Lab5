package haslindavila_.lab5;

public class Canchas extends Lugar{
    private String categoria;
    private String estado;

    public Canchas() {
        super();
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int nivel, Carretera Inicio, Carretera Salida) {
        super(nombre, direccion, nivel, Inicio, Salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Canchas{" + "categoria=" + categoria + ", estado=" + estado + '}';
    }
    
    
}
