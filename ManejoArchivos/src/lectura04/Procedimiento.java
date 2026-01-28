/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author UTPL
 */
public class Procedimiento {

    public static void leerRegistros() {

        double suma = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                double x = Double.parseDouble(linea_partes.get(3));
                suma = suma + x;
                contador = contador + 1;
                for (int i = 0; i < linea_partes.size(); i++) {
                    System.out.println(linea_partes.get(i));
                }
                System.out.println("-----------------------------------");

            } // fin de while

        } 
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        suma = suma / contador;
        System.out.println("El promedio es: " + suma);
    }

}
