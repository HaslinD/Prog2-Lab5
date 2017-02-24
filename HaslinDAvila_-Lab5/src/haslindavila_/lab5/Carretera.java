package haslindavila_.lab5;

public class Carretera {
    private Lugar inicio;
    private Lugar finall;
    private int numero;
    private double distancia;

    public Carretera() {
    }

    public Carretera(Lugar inicio, Lugar finall, int numero, double distancia) {
        this.inicio = inicio;
        this.finall = finall;
        this.numero = numero;
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFinall() {
        return finall;
    }

    public void setFinall(Lugar finall) {
        this.finall = finall;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Carretera{" + "inicio=" + inicio + ", finall=" + finall + ", numero=" + numero + ", distancia=" + distancia + '}';
    }
    
}
