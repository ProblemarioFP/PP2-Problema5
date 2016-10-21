/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dato;    // Declaración de variables
    boolean primo;
    
    dato=pedirDato();       //Metodos
    primo=calcularSiPrimo(dato);
    mostrarResultado(dato,primo);
    }
    
    public static int pedirDato() {     //Metodo que pide datos por teclado
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir numero entero");
        numero = entrada.nextInt();
        return numero;
    }
    public static boolean calcularSiPrimo(int x) {  //Metodo boolean que determina si un número es primo
        boolean prim;
        prim = (x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0);
        return prim;
    }
    public static void mostrarResultado(int x, boolean y){  //metodo para mostrar resultados a traves de estructuras if
        if(x==2||x==3||x==5||x==7){System.out.println("El numero "+x+" es primo");}
        else{if(y==false){
            System.out.println("El numero "+x+ " no es primo");
        }else{System.out.println("El numero "+x+ " es primo");
        
        }
    }
}}
