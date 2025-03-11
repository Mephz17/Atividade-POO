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
       Scanner input = new Scanner(System.in);
       int qtd = 0;
       int soma = 0;
       String entrada = input.nextLine();
       // Fatiando a string
       String[] partes = entrada.split(" ");
       // Iterando sobre a string
       for(int i = partes.length - 1; i >= 0; i--){
           for(int j = partes[i].length() - 1; j >= 0; j--){
               char n = partes[i].charAt(j);
               // Convertendo e verificando condicionais 
               int number = Character.getNumericValue(n);
               if(!(qtd % 2 == 0)){
                   number *= 2;
                   if(number > 9){
                       number -= 9;
                   }
               }
               soma += number;
               qtd++;
           }
       }
       // Verifica se é válido ou não
       if(soma % 10 == 0){
           System.out.println("Valido");
       }
       else{
           System.out.println("Invalido");
       }
    }
}
