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
public class SuperGigante extends Estrella{
    public SuperGigante(String tipo, String nombre, int temperatura, 
            int luminosidad, String tipotemp){
         super(tipo, nombre, temperatura, luminosidad, tipotemp);
    }

    @Override
    public int posibilidadV() {
        return 0;
    }
    
}
