package proyectoprogra;

public class Restaurante extends ObjetoDeJuego {
    
    public Restaurante(){}
    public Restaurante(String nombre){
        super(nombre);
    }
    
    
    @Override
    public void trabajar() {
        if (trabajoConseguido){
            dinero += 500;
            System.out.println("Ha ganado 350 dólares");
        }else{
            System.out.println("No tiene este trabajo");
        }
        tiempo += 3;
        
    }

    @Override
    public void pedirTrabajo() {
        System.out.println("Has conseguido el trabajo en el Restaurante!");
        trabajoConseguido = true;
        tiempo += 3;
    }

    @Override
    public void gastarDinero() {
        String catalogo = "\n1.Hamburguesas\t\t10$\n2.MEGA CP\t\t100$"
            + "\n3.PAPAS MORTÍFERAS\t400$\n4.salchicha\t\t5$\nSeleccione uno:";
        System.out.println(catalogo);
        int numero = entrada.nextInt();
        switch (numero){
            case 1:
                System.out.println("Gracias por comprar Hamburguesas");
                dinero -= 10;
                satisfaccion += 2;
                break;
            case 2:
                System.out.println("Gracias por comprar MEGA CP");
                dinero -= 100;
                satisfaccion += 4;
                break;
            case 3:
                System.out.println("Gracias por comprar PAPAS MORTÍFERAS");
                dinero -= 400;
                satisfaccion += 10;
                break;
            case 4:
                System.out.println("Gracias por comprar salchicha");
                dinero -= 5;
                satisfaccion += 1;
                break;
            default:
                System.out.println("Usted ha seleccionado algo que no se"
                        + "encuentra en el inventario");
        }
        tiempo += 3;
    }
}
