/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesar;

import static cesar.Cesar.charMin;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Magali
 */
public class Cesar {

     static String charMin = "abcdefghijklmnopqrstuvwxyz"; 
    static String charMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
     
    public static void main(String[] args){ 
        int desplazamiento = 1;
        
        try { 
        String texto = "";
        System.out.println("Introduzca el texto: "); 
        texto = bf.readLine(); 
        System.out.println("Texto cifrado: "+cifradoCesar(texto,desplazamiento)); 
        } catch (Exception e) { 
            System.out.print("Valor no valido."); 
        } 
    } 
     
    private static String cifradoCesar(String entrada,int desplazamiento){ 
         int i,j; 
 
        char fraseDescifrada[] = new char[entrada.length()]; 
 
        fraseDescifrada = entrada.toCharArray(); 
 
        for(i=0;i<entrada.length();i++){ 
            for(j=0;j<desplazamiento;j++){ 
                if((fraseDescifrada[i]>65 && fraseDescifrada[i]<=90) || (fraseDescifrada[i]>97 && fraseDescifrada[i]<=122)){ 
                    fraseDescifrada[i]--;               
                } 
                else if(fraseDescifrada[i]==65) 
                    fraseDescifrada[i]='Z'; 
                else if(fraseDescifrada[i]==97) 
                    fraseDescifrada[i]='z'; 
            } 
        } 
 
        entrada = String.valueOf(fraseDescifrada); 
 
        return entrada; 
    } 
}
