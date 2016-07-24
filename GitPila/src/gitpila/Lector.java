/*
 
	Antonio Ixtecoc 15582
	Esteban Avalos 	15059
	
	Descipcion:
	Esta clase es la encargada de ir leyendo el verctor que se crea de cada linea del documeto obtenido
 */
package gitpila;

import java.util.Vector;

public class Lector implements PilaInterfaz{
    
    Vector v=new Vector();
    /*Metodo push para  guardar el valor*/
    public void Push(String y) {
         v.addElement(y);
    }

    /*OMetodo para parsear el valor de un string a un int*/ /*Retorna ultimo valor de la pila*/
    public int Pop() {
       int caracter= Integer.parseInt((String) v.remove(0)) ;
       return caracter;
    }
	/* Metodo para limpiar la pila creada*/
    public void Limpiar (){
        v.removeAllElements();
    }


}
