// ejercicio 2 sumativa 1 .cpp : Programa que muestra la tabla de multiplicar del 1 al10 de cualquier numero entero. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.Scanner;//Importamos la libreria java.util.Scanner para poder leer datos ingresador por pantalla

public class TablasDeMultiplicar {
    public TablasDeMultiplicar() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Creamos el objeto sc para leer la entrada de datos que ingrese el usuario

        System.out.println("Por favor ingrese un numero para visualizar su tabla de multiplicar: "); //Mostramos el mensaje que le indica al usuario que debe ingresar un numero
        int numero = sc.nextInt();//Leemos el numero ingresado por el usuario

        for(int i = 1; i < 11; ++i) { //Creamos un bucle de tipo for donde se multiplique el numero ingresado por el usuario desde el 1 hasta llegar al 10
            System.out.println(numero + "x" + i + "= " + numero * i);//Calculamos y mostramos el resultado por pantalla
        }

    }
}