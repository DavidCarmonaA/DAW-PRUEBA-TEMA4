package zoo;

/**
 * Clase encargada de gestionar el objeto Tiburón, que viene de pez.
 * @author David
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Constructor por defecto, que hereda las características del constructor
     * de pez y añade sus propias variables, específico para el "Tiburón Blanco".
     * Añade un booelano que indica que el tiburón es peligroso.
     * Añade un contador máximo de tiburones registrados.
     * Añade la especie del tiburón.
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor parametrizado, que hereda las características del constructor
     * de pez y añade sus propias variables.
     * Añade un contador máximo de tiburones registrados.
     * @param especie String que define la especie del tiburón.
     * @param peligroso Booleano que define si el tiburón es o no peligroso.
     * @param velocidadMaxNatacion Entero que define su velocidad de nado.
     * @param tipo Enum que define el tipo de tiburón que es.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor parametrizado, que hereda las características del constructor
     * de pez y añade sus propias variables.
     * Añade un contador máximo de tiburones registrados.
     * @param especie String que define la especie del tiburón.
     * @param peligroso Booleano que define si el tiburón es o no peligroso.
     * @param velocidadMaxNatacion Entero que define su velocidad de nado.
     * @param tipo Enum que define el tipo de tiburón que es.
     * @param habitat Enum que define su hábitat.
     * @param comida String que especifíca que come el tiburón.
     * @param longevidad Entero que define cuánto vive el tiburón.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Método que imprime por pantalla la velocidad a la que nada el tiburón.
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Método que imprime por pantalla qué come el tiburón.
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método que finaliza la ejecución, borrando el contador de tiburones.
     * @throws Throwable Lanza una excepción si detecta algún error para que sea
     * capturada en otro método.
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
