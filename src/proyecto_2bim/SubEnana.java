/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2bim;

/**
 *
 * @author usuario
 */
public class SubEnana extends Estrella{
    public SubEnana(String tipo, String nombre, int temperatura, 
            int luminosidad, String tipotemp){
         super(tipo, nombre, temperatura, luminosidad, tipotemp);
    }

    @Override
    public int posibilidadV() {
        return((super.luminosidad*3)/10);
    }
}
