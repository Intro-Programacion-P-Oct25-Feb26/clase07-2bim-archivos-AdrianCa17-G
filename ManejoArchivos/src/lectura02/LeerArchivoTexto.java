package lectura02;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoTexto {
    
    // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                
                /* Se usa doble backslash para identificar correctamente el separador
                del pip y que espacie correctamente, es una funcion exclusiva de
                java, no solo se le puede aplicar al pip, sino tambien a los demas
                separadores como el . * espacios, tabuladores, cualquier separador*/
                
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                
                
                System.out.printf("%s\n", linea_partes.get(0));
                System.out.printf("%s\n", linea_partes.get(1));
                System.out.printf("%s\n", linea_partes.get(2));
                System.out.printf("%s\n", linea_partes.get(3));
                System.out.println("");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
