package proyectoprogra;

public class Universidad extends ObjetoDeJuego{
    
    public Universidad(){}
    public Universidad(String nombre){
        super(nombre);
    }

    @Override
    public void trabajar() {
        if (trabajoConseguido){
            dinero += 1000;
            System.out.println("Ha ganado 500 dólares");
        }else{
            System.out.println("No tiene este trabajo");
        }
        tiempo += 3;
    }

    @Override
    public void pedirTrabajo() {
        if (nivel_educativo >= 3){
            System.out.println("Has conseguido el trabajo en la Universidad!");
            trabajoConseguido = true;
        }else{
            System.out.println("No tiene el nivel educativo necesario");
        }
        tiempo += 3;
    }

    @Override
    public void gastarDinero() {
        String catalogo = "\n1.Ingeniería en sistemas\t1000$"
                + "\n2.Administracion de empresas\t1000$"
                + "\n3.Ingenieria civil\t\t1010$"
                + "\n4.Musica\t\t\t500$"
                + "\nSeleccione uno:";
        System.out.println(catalogo);
        int numero = entrada.nextInt();
        switch (numero){
            case 1:
                System.out.println("Usted ha subido un nivel de educacion en"
                        + "Ingeniería en sistemas");
                nivel_educativo += 1;
                dinero -= 1000;
                break;
            case 2:
                System.out.println("Usted ha subido un nivel de educacion en"
                        + "Administracion de empresas");
                nivel_educativo += 1;
                dinero -= 1000;
                break;
            case 3:
                System.out.println("Usted ha subido un nivel de educacion en"
                        + "Ingenieria civil");
                nivel_educativo += 1;
                dinero -= 1010;
                break;
            case 4:
                System.out.println("Usted ha subido un nivel de educacion en"
                        + "Musica");
                nivel_educativo += 1;
                dinero -= 500;
                break;
            default:
                System.out.println("Usted ha seleccionado algo que no se"
                        + " encuentra en la lista");
        }
        tiempo += 3;
    }
    
}
