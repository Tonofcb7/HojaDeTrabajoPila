/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpila;

import java.util.Vector;

public class Lector implements PilaInterfaz{
    
    Vector v=new Vector();
    @Override
    public void Push(String y) {
         v.addElement(y);
    }

    @Override
    public int Pop() {
       int caracter= Integer.parseInt((String) v.remove(0)) ;
       return caracter;
    }
    public void Limpiar (){
        v.removeAllElements();
    }


}
