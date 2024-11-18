package logicaNegocio;

public abstract class Animal {
    private TipoHabitat habitat;
    
    
    
    

    public abstract String emitirSonido();
    public abstract String obtenerDieta();

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

}