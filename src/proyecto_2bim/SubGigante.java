package proyecto_2bim;

/**
 *
 * @author usuario
 */
public class SubGigante extends Estrella{
    public SubGigante(String tipo, String nombre, int temperatura, 
            int luminosidad, String tipotemp){
         super(tipo, nombre, temperatura, luminosidad,tipotemp);
     }

    @Override
    public int posibilidadV() {
        return(super.luminosidad/10);
    }
}
