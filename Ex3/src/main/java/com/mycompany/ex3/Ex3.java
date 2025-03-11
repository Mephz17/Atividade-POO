/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ex3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        int number;
        int soma, maior, menor, qtdNumeros;
        // Inicializa as variáveis
        soma = maior = menor = qtdNumeros = 0;
        number = input.nextInt();
        while(number != -1){
            qtdNumeros++;
            if(number > maior){
                // Atualiza valores
                if(maior < menor || (menor == 0 && qtdNumeros >= 2)){
                    menor = maior;
                }
                maior = number;
                
            }
            else if(number < menor || (menor == 0 && qtdNumeros >= 2)){
                menor = number;
            }
            soma += number;
            media = soma / (double)qtdNumeros;
            number = input.nextInt();
        }
        System.out.println("Media: "+media+"\nMaior: "+maior+"\nMenor: "+menor+"\nQuantidade: "+qtdNumeros);
    }
}
