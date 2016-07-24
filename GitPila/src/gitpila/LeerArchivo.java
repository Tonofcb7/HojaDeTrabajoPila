/*
 Antonio Ixtecoc 	15582
 Esteban Avalos		15059
 
	Clase que se encarga dde abrir el archivo y leerlo
 */
package gitpila;
/* Se importan librerias necesarias*/
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class LeerArchivo {
	/*Atributos*/
    private String path;
    /*Contructor*/
    public LeerArchivo(String file_path){
        path=file_path;
        
    }
    /*Metodo para poder cargar el archivo de conde este guardado*/
    public String[] abrirArchivo() throws IOException{
        
        FileReader lectura = new FileReader(path);
        BufferedReader lector = new BufferedReader(lectura);
        
        int lineas = leerLineas();
        String[] datosTexto = new String[lineas];
        
        int x;
        for (x=0;x<lineas;x++)
            datosTexto[x] = lector.readLine();
        
        lector.close();
        return datosTexto;
    }
    /* Metodo de guardado en un vercto cada linea leida del documento*/
    public int leerLineas() throws IOException{
        
        FileReader archivo = new FileReader(path);
        BufferedReader lector2 = new BufferedReader(archivo);
        
        String linea;
        int cantidadLineas = 0;
        
        while ((linea = lector2.readLine()) != null){
            cantidadLineas++;
        }
        
        lector2.close();
        return cantidadLineas;
    }
}