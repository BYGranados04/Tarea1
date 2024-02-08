/*Instrucciones
Dada una palabra, calcule la puntuación de escalable para esa palabra.

Letra                        Valor

A, E, I, O, U, L, N, R, S, T = 1
D, G = 2
B, C, M, P =  3
F, H, V, W, Y = 4
K = 5
J, X = 8
Q, Z = 10
*/

package com.mycompany.tarea1;
import java.util.Scanner;

public class Tarea1 
{
    public static void main(String[] args) 
    {
 
    int valor = 0;
    //Scanner
    Scanner sc = new Scanner(System.in);
    String palabra;
    
    
    System.out.print("Ingresa una palabra: ");
    palabra=sc.nextLine().toLowerCase();
   
        //ciclo for que hace el calculo
        for(int i=0;i<palabra.length();i++){
            
          char letra = palabra.charAt(i);
            
          int valorLetra = obtenervalorLetra(letra);
          
         valor += valorLetra;
              
    } 
   
        System.out.println("El valor de "+palabra); System.out.println("es: "+valor);
  }
    //funcion para obtener el valor de la Letra.
    private static int obtenervalorLetra(char letra){
        //Valor de las letras
        if(letra == 'a'|| letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'o'|| letra == 'u'|| letra == 'l'|| letra == 'n'|| letra == 'r'|| letra == 's'|| letra == 't'){
            return 1;    
        }else if(letra == 'd'|| letra == 'g'){   
            return 2;
        }else if(letra == 'b'|| letra == 'c'|| letra == 'm'|| letra == 'p'){
            return 3;
        }else if(letra == 'f'|| letra == 'h'|| letra == 'v'|| letra == 'w'|| letra == 'y'){
            return 4;
        }else if(letra == 'k'){
            return 5;
        }else if(letra == 'j' || letra == 'x'){
            return 8;
        }else if(letra == 'q' || letra == 'z'){
            return 10;
        }
        return 0;
    }    
 }
