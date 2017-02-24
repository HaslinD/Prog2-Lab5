package haslindavila_.lab5;

public class Casa extends Lugar{

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, int nivel, Carretera Inicio, Carretera Salida) {
        super(nombre, direccion, nivel, Inicio, Salida);
    }

    @Override
    public String toString() {
        return "Casa{" + '}';
    }
    
}
