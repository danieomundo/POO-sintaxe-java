/* 
Escreva um programa que recebe como parâmetro um número inteiro n. 
A função deve ler n valores do teclado e retornar quantos destes 
valores são negativos.   
*/

import java.util.Scanner;

public class Ex01 {
    
    public static int qtdNeg (int n){
                  
    Scanner leia = new Scanner(System.in);
    
    int i;
    int n_atual;
    int qtd_negativo = 0;
    
    for (i=0; i<n; i++){ 
    
        System.out.println(i+1+" numero: ");
        n_atual = leia.nextInt();
           
         if (n_atual < 0){
             qtd_negativo +=1;
          }
       }
        
       System.out.println("Quantidade de numeros negativos: " +qtd_negativo);   
       return qtd_negativo;
     }
   
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de n: ");
        qtdNeg(leia.nextInt());
     }
        
}


