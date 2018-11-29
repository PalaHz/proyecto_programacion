package proyectoprogra;

/**
 *
 * @author usuario
 */
public abstract class ObjetoDeJuego extends Juego {
    
    boolean trabajoConseguido = false;
    String nombre = "";
    String queHacer = String.format("\n1. Trabajar\n2. Comprar\n3. Pedir trabajo"
            + "\n4. Salir\nSeleccione uno: ");
    
    public ObjetoDeJuego(){}
    public ObjetoDeJuego(String nombre){
        this.nombre = nombre;
    }
    
    
    
    public abstract void trabajar();
    public abstract void pedirTrabajo();
    public abstract void gastarDinero();
}
