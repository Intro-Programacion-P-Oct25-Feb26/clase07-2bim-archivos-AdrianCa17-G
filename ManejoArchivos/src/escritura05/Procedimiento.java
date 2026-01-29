/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;
/**
 *
 * @author UTPL
 */
public class Procedimiento {
    
     public static void agregarRegistros(String cadenaFinal, String archivo) {
         
         String ruta = String.format("data/%s.txt", archivo);

        try {
            
            FileOutputStream fos = new FileOutputStream(ruta, true); // true = append
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            
            salida.format("%s", cadenaFinal);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }
    
}
