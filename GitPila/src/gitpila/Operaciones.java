/*
	Esteban avalos 	15059
	Antonio Ixtecoc 15582
		
	Esta Clase es la encargada de realizar las opercaciones  de cada linea
 */
package gitpila;


public class Operaciones {
    /*Operacion de suma de dos numeros*/
    public int Suma (int x, int y){
        int suma;
        suma= x + y;
        return suma;
    }
    /*Operacion de resta de dos numeros*/
    public int Resta (int x, int y){
        int resta;
        resta= x-y;
        return resta;
    }
    /*Operacion de division de dos numeros*/
    public int Division (int x, int y){
        int division;
        division= x/y;
        return division;
    }
    /*Operacion de multiplicacion de dos numeros*/
    public int Multiplicacion(int x, int y){
        int mul;
        mul= x*y;
        return mul;
    }
}