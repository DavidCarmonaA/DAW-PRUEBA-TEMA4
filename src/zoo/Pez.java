package zoo;

public abstract class Pez extends Animal {

    public enum Tipo {
        OSEO, CARTILAGINOSO
    }

    private int velocidadMaxNatacion;
    private Tipo tipo;
    private static int numPeces = 0;

    public Pez(int velocidadMaxNatacion, Tipo tipo) {
        this.velocidadMaxNatacion = velocidadMaxNatacion;
        this.tipo = tipo;
        this.numPeces++;
    }

    public Pez(int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(habitat, comida, longevidad);
        this.velocidadMaxNatacion = velocidadMaxNatacion;
        this.tipo = tipo;
        this.numPeces++;
    }

    public int getVelocidadMaxNatacion() {
        return velocidadMaxNatacion;
    }

    public void setVelocidadMaxNatacion(int velocidadMaxNatacion) {
        this.velocidadMaxNatacion = velocidadMaxNatacion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static int getNumPeces() {
        return numPeces;
    }

    public static void setNumPeces(int numPeces) {
        Pez.numPeces = numPeces;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    protected void finalize() throws Throwable {
        numPeces--;
        super.finalize();
    }
}
