/*
Imprima a soma de 1 até 999.
*/

public class Ex03 {
  
    public static void main (String[] args) {
      
      int num=1;
      int soma=0;
      
      while (num<1000) {
        soma+=num;
        num+=1;
      }
      
      System.out.println("A soma de 1 ate 999: "+soma);      
      
    }
}
