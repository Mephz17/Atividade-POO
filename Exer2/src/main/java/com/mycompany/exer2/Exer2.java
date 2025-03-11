/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer2;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Exer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdFaltas = input.nextInt();
        int qtdProdutos = input.nextInt();
        
        double salario;
        
        if(qtdProdutos > 20){
            salario = 13.00;
        }
        else{
            salario = 10.00;
        }
        salario *= qtdProdutos;
        if(qtdFaltas > 5){
            salario = salario - (salario * (15/100));
        }
        System.out.println("O salario pago foi de: RS "+ salario);
    }
}
