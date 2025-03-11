/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex4 {

     public static void main(String[] args) {
       Scanner Input = new Scanner(System.in);
       int Qtd = 0;
       int Soma = 0;
       String Entrada = Input.nextLine();
       String[] Partes = Entrada.split(" ");
       for(int i = Partes.length - 1; i >= 0; i--){
           for(int j = Partes[i].length() - 1; j >= 0; j--){
               char N = Partes[i].charAt(j);
               int Number = Character.getNumericValue(N);
               if(!(Qtd % 2 == 0)){
                   Number *= 2;
                   if(Number > 9){
                       Number -= 9;
                   }
               }
               Soma += Number;
               Qtd++;
           }
       }
       if(Soma % 10 == 0){
           System.out.println("Valido");
       }
       else{
           System.out.println("Invalido");
       }
    }
}
