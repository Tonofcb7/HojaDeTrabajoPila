/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpila;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class LeerArchivo {

    private String path;
    
    public LeerArchivo(String file_path){
        path=file_path;
        
    }
    
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


