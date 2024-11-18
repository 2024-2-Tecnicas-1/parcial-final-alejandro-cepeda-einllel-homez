package logicaNegocio;

public class Delfin extends Animal {

    public Delfin(TipoHabitat habitat) {
        super(habitat);
    }
    
    String emitirSonido(){
        return "Chirrido";
    }
    String obtenerDieta(){
        return "Pescado";
    }
   
    
    
   
}
