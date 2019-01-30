package proyecto_2bim;

/**
 *
 * @author usuario
 */
public abstract class Estrella {
    String tipoTemp;
    String tipo;
    String nombre;
    int temperatura;
    int luminosidad;
    public Estrella(){}
    /*
    RECIBE LOS DATOS DEL TIPO Y TIPO TEMP
    */
    public Estrella(String tipo, String nombre, int temperatura, 
            int luminosidad,String tipoTemp){
        this.tipo = tipo; 
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
   }
    public abstract int posibilidadV();
}
