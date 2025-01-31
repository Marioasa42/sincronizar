/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.programacion;
import java.util.Scanner;
public class EJERCICIOSPROGRAMACION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: "); 
        String frase1 = sc.nextLine();
        System.out.println("Segunda frase: "); 
        String frase2 = sc.nextLine();
        if (frase1.length() < frase2.length()) System.out.println("La frase 2 es mas larga que la frase 1");
        else if(frase1.length() < frase2.length()) System.out.println("La frase 1 es mas larga que la frase 2");
        else System.out.println("La frase 2 es igual de larga que la frase 1");
    }
    
}
