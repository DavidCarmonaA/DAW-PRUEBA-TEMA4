package zoo;

public abstract class Animal implements Curable {

    private static int numAnimales = 0;

    protected String comida;
    private int longevidad;
    private Habitat habitat;
    private Tratamiento tratamiento;

    public enum Habitat {
        SELVA, ESTEPA, DESIERTO, BOSQUE, ARTICO
    }

    public Animal() {
        numAnimales++;
    }

    public Animal(Habitat habitat, String comida, int longevidad) {
        this();
        this.habitat = habitat;
        this.comida = comida;
        this.longevidad = longevidad;
    }

    public static int getNumAnimales () { return numAnimales; }
    
    public int getLongevidad () { return longevidad; }
    
    public String getComida  () { return comida; }
    
    public Habitat getHabitat () { return habitat; }
    
    public void setLongevidad (int longevidad) { this.longevidad = longevidad; }
    
    public void setComida (String comida) { this.comida = comida; }
    
    public void setHabitat (Habitat habitat) { this.habitat = habitat; }
    
    @Override
    protected void finalize () throws Throwable {
        numAnimales--;
        super.finalize();
    }

    // Implementa interface Curable
    public void setTratamiento (Tratamiento tratamiento) { this.tratamiento = tratamiento; }
    
    public Tratamiento getTratamiento () { return tratamiento; }
    
    public void quitarTratamiento () { if (tratamiento != null) tratamiento = null; }
    
    
    // Métodos a implementar en las clases derivadas
    public abstract void desplazar();
    
    public abstract void comer();
    
}

