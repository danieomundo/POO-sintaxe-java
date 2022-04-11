/*
Imprima os primeiros números da série de Fibonacci até passar de 100. 
A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por 
diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo 
elemento (ex: 8 = 5 + 3)
*/

public class Ex06 {
    
    public static void Ex06_fibonacci(int N){
        
        int termo1 = 0;
        int termo2 = 1;
        System.out.println("Primeiro termo: \n" + termo1);
        System.out.println("Segundo termo: " +termo2);
        
        for (int i=0; i<N-2; i++){
            
            int termo3 = termo1+termo2;
            termo1 = termo2;
            termo2 = termo3;
            System.out.println(i+3+" termo: "+termo3);
        }
    }
  
    public static void main(String[] args) {
        Ex06_fibonacci(200);
    }
}
