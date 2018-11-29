package proyectoprogra;

import java.util.Scanner;

public class Menu {
    Juego j1 = new Juego();
    boolean pregunta = true;
    Scanner entrada = new Scanner(System.in);
    String menu = String.format("\n**********MENU**********\n"
            +"\t1. INICIAR JUEGO\n\t2. OBJETIVOS\n\t3. CREDITOS\n\t4. SALIR\n");
    String objetivos = String.format("El objetivo del juego es llegar a:\n"
            + "\t10000 Dólares\n\t100 puntos de satisfacicon");
    public Menu(){}
    public void iniciarMenu(){
        System.out.println(menu);
        do{
            System.out.println("SELECCIONE UNO:");
            int seleccion = entrada.nextInt();
            switch(seleccion){
                case 1:
                    j1.comenzarJuego();
                    pregunta = false;
                    break;
                case 2:
                    System.out.println(objetivos);
                    break;
                case 3:
                    System.out.println("Creditos a Andres Palacios");
                    break;
                case 4:
                    pregunta = false;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
            
        }while (pregunta);
    }
}
