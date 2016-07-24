/*
 Antonio Ixtecoc 15582
 Esteban Avalos	 15059
 
	Clase encargada de la inicializacion del programa, obtiene la dirreccion
	del documento, ejecuta las operaciones debidas para leerlo y operarlo
 */
package gitpila;

/**
 *
 * @author AntonioJose
 */
import java.io.IOException;
import java.util.Vector;

public class Pila {
   /* Inicio del programa*/
    public static void main(String[] args) throws IOException{
        String nombre = "C:\\Users\\AntonioJose\\Desktop\\Prueba.txt";
        Vector v1= new Vector();
        Operaciones op= new Operaciones();
        
        /* Se manda la direccion al modulo leer archivo para la continuacion de la lectura*/
        try {
            LeerArchivo archivo = new LeerArchivo(nombre);
            String[] ArregloLineas = archivo.abrirArchivo();
            
            int y;
                
            for(y=0;y<ArregloLineas.length;y++){
                Lector L1= new Lector();
                String cad1= ArregloLineas[y];
                int x;
                if(cad1.length() != 0){
                for(x=0;x<cad1.length();x++){
                    String car= String.valueOf(cad1.charAt(x));
                    v1.addElement(car);
                }
                int x1;
				/* se recorre el vector de linas y se verifica cada caracter y se envia a su respectiva operacion*/
                for(x1=0;x1<v1.size();x1++){
                    String car2= (String) v1.elementAt(x1);
                    switch (car2) {
                        case "+":
                            {
                                int x2= L1.Pop();
                                int y2= L1.Pop();
                                L1.Push(String.valueOf(op.Suma(x2,y2)));
                                break;
                            }
                        case "-":
                            {
                                int x2= L1.Pop();
                                int y2= L1.Pop();
                                L1.Push(String.valueOf(op.Resta(x2, y2)));
                                break;
                            }
                        case "*":
                            {
                                int x2= L1.Pop();
                                int y2= L1.Pop();
                                L1.Push(String.valueOf(op.Multiplicacion(x2, y2)));
                                break;
                            }
                        case "/":
                            {
                                int x2= L1.Pop();
                                int y2= L1.Pop();
                                L1.Push(String.valueOf(op.Division(x2, y2)));
                                break;
                            }
                        case " ":
                            break;
                        default:
                            String l2= String.valueOf(car2);
                            L1.Push(l2);
                            break;
                    }
            }     
        System.out.println(L1.Pop());
                }
        }
        }
        
        catch (IOException e){
            System.out.println(e.getMessage() );
        }
        
    }
    
}