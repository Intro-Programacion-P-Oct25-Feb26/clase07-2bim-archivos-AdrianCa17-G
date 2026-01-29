/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            cadenaFinal = "";

            System.out.println("Ingrese cedula de usuario ");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese nombre del usuario ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese tipo de carro del usuario ");
            String tipoCarro = entrada.nextLine();
            System.out.println("Ingrese placa de carro del usuario ");
            String placaCarro = entrada.nextLine();

            System.out.println("Presione s si desea terminar el programa");
            String opcionSalida = entrada.nextLine();

            if (opcionSalida.equals("s")) {
                bandera = false;

            }

            String inicial = placaCarro.substring(0, 1).toUpperCase();

            String archivo;

            switch (inicial) {
                case "L":
                    archivo = "vehiculosConPlacaL";
                    break;

                case "G":
                    archivo = "vehiculosConPlacaG";
                    break;

                case "P":
                    archivo = "vehiculosConPlacaP";
                    break;

                default:
                    archivo = "vehiculosConOtrasPlacas";
                    break;
            }

            cadenaFinal = String.format("%s | %s | %s | %s | %s\n", cadenaFinal,
                    cedula,
                    nombre,
                    tipoCarro,
                    placaCarro);

            Procedimiento.agregarRegistros(cadenaFinal, archivo);

        }

    }

}
