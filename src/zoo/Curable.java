package zoo;

public interface Curable {
    public boolean enfermo = true;
    
    public enum Tratamiento { ANTIBIOTICO, ANALGESICO, ANTITERMICO, ANTIVIRAL, ANTIINFLAMATORIO }
    
    public void setTratamiento (Tratamiento tratamiento);
    
    public Tratamiento getTratamiento();
    
    public void quitarTratamiento();
}
