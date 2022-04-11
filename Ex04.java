/*
Imprima todos os múltiplos de 3 entre 1 e 100. 
*/

public class Ex04 {
  
  public static void main(String[] args){
    
    int num=1;
    System.out.println("Multiplos de 3, de 1 ate 100: ");
    
    while (num < 100) {
      if (num % 3 == 0) {
        System.out.println(num);
      }
      num+=1;
    } 
  }
}
