package proyectoprogra;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Juego {
    
    
    
    static Scanner entrada = new Scanner(System.in);
    static int dinero = 0;
    static int tiempo = 0;
    static int satisfaccion = 0;
    static int nivel_educativo = 0;
    static String cosasqueHacer = "\n1. Ir al restaurante\n2. Ir a universiad\n"
            + "3. Ir a la tienda\n4. Descansar\n";
    
    public Juego(){}
    
    public void comenzarJuego(){
        
        ObjetoDeJuego restaurante1 = new Restaurante("Las lechugas");
        ObjetoDeJuego universidad1 = new Universidad("UTPL");
        ObjetoDeJuego tienda1 = new Tienda("Esteban Dido");
        
        while (dinero < 10000 && satisfaccion < 100 ){
            for (tiempo = 6; tiempo < 24; tiempo++){
                System.out.printf("***** TIEMPO: %d HORAS****\n%s\n"
                        + "SELECCIONE UNO:",tiempo, cosasqueHacer);
                int seleccion = entrada.nextInt();
                switch (seleccion){
                    case 1:
                        System.out.println("Usted fue al restaurante,"
                                + " ¿qué desea hacer?");
                        System.out.print(restaurante1.queHacer);
                        int seleccion2 = entrada.nextInt();
                        switch (seleccion2){
                            case 1:
                                restaurante1.trabajar();
                                break;
                            case 2:
                                restaurante1.gastarDinero();
                                break;
                            case 3:
                                restaurante1.pedirTrabajo();
                                break;
                            case 4:
                                tiempo += 1;
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Usted fue a la universidad,"
                                + " ¿qué desea hacer?");
                        System.out.print(universidad1.queHacer);
                        seleccion2 = entrada.nextInt();
                        switch (seleccion2){
                            case 1:
                                universidad1.trabajar();
                                break;
                            case 2:
                                universidad1.gastarDinero();
                                break;
                            case 3:
                                universidad1.pedirTrabajo();
                                break;
                            case 4:
                                tiempo += 1;
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Usted fue a la tienda,"
                                + " ¿qué desea hacer?");
                        System.out.print(tienda1.queHacer);
                        seleccion2 = entrada.nextInt();
                        switch (seleccion2){
                            case 1:
                                tienda1.trabajar();
                                break;
                            case 2:
                                tienda1.gastarDinero();
                                break;
                            case 3:
                                tienda1.pedirTrabajo();
                                break;
                            case 4:
                                tiempo += 1;
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Se durmió dos horas");
                        tiempo += 2;
                        satisfaccion += 3;
                    default:
                        System.out.println("No ha seleccionado una opcion"
                                + "correcta");
                }
                System.out.printf("\nPUNTOS DE SATISFACCION: %d"
                        + "\nDINERO: %d\n",satisfaccion,dinero);
            }
        }
        System.out.println("HA GANADO EL JUEGO");
    }
}
