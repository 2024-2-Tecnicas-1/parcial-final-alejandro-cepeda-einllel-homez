package logicaNegocio;

public class Perro extends Animal implements Domestico{

    public Perro(TipoHabitat habitat) {
        super(habitat);
    }
    

    @Override
    String emitirSonido() {
        return "Ladrido";
    }

    @Override
    String obtenerDieta() {
        return "Omnivoro";
    }

    @Override
    public void interactuarConHumano() {
        System.out.println("El perro mueve la cola y ladra de felicidad");
    }
    
    
    
    
    
}
