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
public class Gigante extends Estrella{
    public Gigante(String tipo, String nombre, int temperatura, int luminosidad,
            String tipotemp){
         super(tipo, nombre, temperatura, luminosidad, tipotemp);
         super.tipo = "Gigante";
    }

    @Override
    public int posibilidadV() {
        return((super.luminosidad*(-4))/10);
    }
}

