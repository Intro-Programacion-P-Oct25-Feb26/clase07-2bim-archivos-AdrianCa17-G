/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class estadistica {

    public static int obtenerTotalEmpleados() {
        int contadorEmpleados = 0;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.csv"));
            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();

                try {
                    String[] partes = linea.split("\\|");

                    if (partes.length < 3) {
                        throw new Exception("Registro inválido");
                    }

                    int empleados = Integer.parseInt(partes[2]);
                    contadorEmpleados = contadorEmpleados + empleados;

                } catch (Exception e) {
                }
            }

            entrada.close();

        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
        }

        return contadorEmpleados;

    }
}
