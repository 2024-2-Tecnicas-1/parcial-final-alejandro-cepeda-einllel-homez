package logicaNegocio;

public class Leon extends Animal{

    public Leon(TipoHabitat habitat) {
        super(habitat);
    }
    
    String emitirSonido(){
        return "Rugido";
        
    }
    String obtenerDieta(){
        return "Carnívoro";
    }
    
    
   

    
    
    
}
