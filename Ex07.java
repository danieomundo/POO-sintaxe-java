 /* 
 * 
 * O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa 
 * com os funcionários pedindo que cada um avaliasse a qualidade das refeições 
 * informando uma nota de 0 a 100. O setor quer saber o percentual de funcionários 
 * que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 
 * 25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100). 
 * Escreva um programa que leia as notas informadas e imprima o percentual de 
 * funcionários que votou em cada faixa. A entrada de dados deve terminar quando 
 * for lido um valor que não pertença a nenhum dos intervalos acima.
 * 
 */

import java.util.Scanner;

public class Ex07 {
    
    public static void Ex07_nota(){
        Scanner leia = new Scanner(System.in);

        int cont_func = 0;
        int pess = 0;
        int ruim = 0;
        int boa = 0;
        int otima = 0;
        int resp = 0;
        
        while (resp >= 0 && resp <= 100){
            
            cont_func+=1;
            System.out.print("Funcionario: "+cont_func+" - Nota: ");
            resp = leia.nextInt();

            if (0 <= resp && resp <= 25){
                pess+=1;
            }
            else if (resp > 25 && resp <= 50){
                ruim+=1;
            }
            else if (resp > 50 && resp <= 75){
                boa+=1;
            }
            else if (resp > 75 && resp <= 100){
                otima+=1;
            }
            else{
                System.out.println("");
            }
        }
        float percent_pess = (float) pess / cont_func*100;
        float percent_ruim = (float) ruim / cont_func*100;
        float percent_boa = (float) boa / cont_func*100;
        float percent_otima = (float) otima / cont_func*100;

        System.out.println(String.format("Percentual que votaram em pessimas condicoes: %.2f%%.",(percent_pess)));
        System.out.println(String.format("Percentual que votaram em ruins condicoes: %.2f%%",(percent_ruim)));
        System.out.println(String.format("Percentual que votaram em boas condicoes: %.2f%%",(percent_boa)));
        System.out.println(String.format("Percentual que votaram em otimas condicoes: %.2f%%",(percent_otima)));
    }

    public static void main(String[] args) {
        Ex07_nota();
    }
}
