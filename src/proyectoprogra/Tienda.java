/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

/**
 *
 * @author usuario
 */
public class Tienda extends ObjetoDeJuego {
   
    public Tienda(){}
    public Tienda(String nombre){
        super(nombre);
    }
        
    @Override
    public void trabajar() {
        if (trabajoConseguido){
            dinero += 300;
            System.out.println("Ha ganado 200 dólares");
        }else{
            System.out.println("No tiene este trabajo");
        }
        tiempo += 3;
    }

    @Override
    public void pedirTrabajo() {
        System.out.println("Has conseguido el trabajo en la Tienda!");
        trabajoConseguido = true;
        tiempo += 3;
    }

    @Override
    public void gastarDinero() {
        String catalogo = "\n1.Televisor\t500$\n2.Computadora\t800$"
            + "\n3.Videojuegos\t100$\n4.Celular\t300$\nSeleccione uno:";
        System.out.println(catalogo);
        int numero = entrada.nextInt();
        switch (numero){
            case 1:
                System.out.println("Gracias por comprar Televisor");
                dinero -= 500;
                satisfaccion += 10;
                break;
            case 2:
                System.out.println("Gracias por comprar Computadora");
                dinero -= 800;
                satisfaccion += 20;
                break;
            case 3:
                System.out.println("Gracias por comprar Videojuegos");
                dinero -= 100;
                satisfaccion += 5;
                break;
            case 4:
                System.out.println("Gracias por comprar Celular");
                dinero -= 300;
                satisfaccion += 100;
                break;
            default:
                System.out.println("Usted ha seleccionado algo que no se"
                        + "encuentra en el inventario");
        }
    }
}
