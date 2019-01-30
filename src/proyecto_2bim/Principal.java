package proyecto_2bim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Estrella> Estrellas = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        boolean pregunta = true;
        leerArchivo();
        //Lee el archivo y lo almacena en un arreglo de tipo Estrella

        while (pregunta) {
            System.out.println("//////MENU DE CLASIFICACION DE ESTRELLAS////");
            System.out.printf("[1] Buscar\n[2] Realizar Tabla con"
                    + " resultados\n[3] SALIR\nSeleccione uno: ");
            int seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("INGRESE EL NOMBRE DEL ELEMENTO A BUSCAR:");
                    String nombre = entrada.nextLine();
                    System.out.println(Buscar(nombre));
                    break;
                case 2:
                    Formatter fileOut = new Formatter("Resultados.csv");
                    fileOut.format("CLASIFICACION DE ESTRELLAS\r\n"
                            + "POR SU TAMANIO\r\n"
                            + "SUBENANAS;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("SubEnana") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    fileOut.format("\r\nENANAS;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("Enana") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    fileOut.format("\r\nSUBGIGANTES;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("SubGigante") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    fileOut.format("\r\nGIGANTE;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("Gigante") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    fileOut.format("\r\nGIGANTE;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("Gigante") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    fileOut.format("\r\nSUPERGIGANT;PROB. VIDA\r\n");
                    for(int i = 0; i < Estrellas.size(); i++){
                        if(Estrellas.get(i).tipo.equals("SuperGigante") ){
                            fileOut.format("%s;%d",Estrellas.get(i).nombre,
                                    Estrellas.get(i).posibilidadV());
                        }
                    }
                    break;
                case 3:
                    pregunta = false;
            }
        }
    }
    /*
    LEE EL ARCHIVO, USA EL SCANNER PARA BUSCAR LA TABLA Y ALMACENARLA EN EL
    ARREGLO ESTRELLAS
    */
    public static void leerArchivo() throws FileNotFoundException {
        String tipotemp = "";
        String nombre;
        int temperatura;
        int luminosidad;
        try (Scanner fileIn = new Scanner(new File("Tabla_Estrellas.csv"))) {
            fileIn.nextLine();
            while (fileIn.hasNextLine()) {
                String[] linea = fileIn.nextLine().split(";");
                nombre = linea[0];
                temperatura = Integer.parseInt(linea[1]);
                luminosidad = Integer.parseInt(linea[2]);
                //SELECCION DEL TIPO POR TEMPERATURA
                if (temperatura >= 33000){
                    tipotemp = "O";
                }
                if (temperatura >= 10000 && temperatura < 33000){
                    tipotemp = "B";
                }
                if (temperatura >= 7500 && temperatura < 10000 ){
                    tipotemp = "A";
                }
                if (temperatura >= 6000 && temperatura < 7500 ){
                    tipotemp = "F";
                }
                if (temperatura >= 5200 && temperatura < 6000 ){
                    tipotemp = "G";
                }
                if (temperatura >= 3700 && temperatura < 5200 ){
                    tipotemp = "K";
                }
                if (temperatura < 3700 ){
                    tipotemp = "M";
                }
                //SELECCION DEL TIPO POR TAMAÑO
                if (luminosidad >= 10) {
                    Estrella e = new SubEnana("SubEnana", nombre, temperatura,
                            luminosidad,tipotemp);
                    Estrellas.add(e);
                } else if (luminosidad >= 5 && luminosidad < 10) {
                    Estrella e = new Enana("Enana", nombre, temperatura,
                            luminosidad,tipotemp);
                    Estrellas.add(e);
                } else if (luminosidad >= 0 && luminosidad < 5) {
                    Estrella e = new SubGigante("SubGigante", nombre, temperatura,
                            luminosidad,tipotemp);
                    Estrellas.add(e);
                } else if (luminosidad >= -10 && luminosidad < 0) {
                    Estrella e = new Gigante("Gigante", nombre, temperatura,
                            luminosidad,tipotemp);
                    Estrellas.add(e);
                } else if (luminosidad < -10) {
                    Estrella e = new SuperGigante("SuperGigante", nombre, temperatura,
                            luminosidad,tipotemp);
                    Estrellas.add(e);
                }
            }
        }
    }

    public static String Buscar(String nombre) {
        int index = 0;
        boolean encontrado = false;
        for (int i = 0; i < Estrellas.size(); i++) {
            if (Estrellas.get(i).nombre.equals(nombre)) {
                encontrado = true;
                index = i;
            }
        }
        if (encontrado){
            return (String.format("NOMBRE: %s\nTemperatura: %d\nLuminosidad: %d"
                    + "\nTIPO por TAMAÑO: %s\nTIPO por Temperatura: %s\n",
                    Estrellas.get(index).nombre,Estrellas.get(index).temperatura,
                    Estrellas.get(index).luminosidad,Estrellas.get(index).tipo,
                    Estrellas.get(index).tipoTemp));
        }else{
            return ("NO SE HA ENCONTRADO ESA ESTRELLA");
        }
    }

}
