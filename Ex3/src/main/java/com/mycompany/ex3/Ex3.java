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
        double Media = 0;
        int Number;
        int Soma, Maior, Menor, QtdNumeros;
        Soma = Maior = Menor = QtdNumeros = 0;
        Number = input.nextInt();
        while(Number != -1){
            QtdNumeros++;
            if(Number > Maior){
                if(Maior < Menor || (Menor == 0 && QtdNumeros >= 2)){
                    Menor = Maior;
                }
                Maior = Number;
                
            }
            else if(Number < Menor || (Menor == 0 && QtdNumeros >= 2)){
                Menor = Number;
            }
            Soma += Number;
            Media = Soma / (double)QtdNumeros;
            Number = input.nextInt();
        }
        System.out.println("Media: "+Media+"\nMaior: "+Maior+"\nMenor: "+Menor+"\nQuantidade: "+QtdNumeros);
    }
}
