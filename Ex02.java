/*

Escreva um programa que efetue a leitura de três valores reais R, S e T, imprimindo qual deles é o maior.

*/

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
    System.out.println("Digite 3 numeros: ");
    Scanner leia = new Scanner(System.in);
    
    float R = leia.nextFloat();
    float S = leia.nextFloat();
    float T = leia.nextFloat(); 
    float maiorNum;
    
    if ((R > S) && (R > T)){
        maiorNum=R;
    }
    
    if ((S > R) && (S > T)){
        maiorNum=S;
    }
    else {
        maiorNum=T;
    }
    
    System.out.println("O maior num eh " + maiorNum);
        
    }
      
}
