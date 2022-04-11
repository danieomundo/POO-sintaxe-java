/*
Escreva um programa recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!). 
Se não for possível calcular o fatorial, a função deve imprimir uma mensagem e retornar o valor -1.
*/

import java.util.Scanner;

public class Ex05 {
    
    public static int Ex05_fat(){
       
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite N: ");        
        int N = leia.nextInt();
    
        if (N > 0){
            int num_inicial = N;
            int aux_fat = N;
            while(aux_fat > 1){
                N = N*(aux_fat-1);
                aux_fat--;
            }
            System.out.println("Fatorial de " +num_inicial+ " eh: " +N);
            return N;
        }
            
        else{
        System.out.println("Impossivel calcular fatorial de " +N);
        return -1;
        }
    }
    
    public static void main(String[] args){
        Ex05_fat();
    }
   
}
