
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*** QUIZ ***");
        System.out.println("Seja bem-vindo(a)!");
        System.out.println("Será que você consegue acertar nossas questões?\n");
        System.out.println("1- Qual é a fórmula da água?\n");
        System.out.println("a) H2O");
        System.out.println("b) CO2");
        System.out.println("c) NaCl");
        System.out.println("d) C6H12O6");

        System.out.println("\nDigite a sua resposta:");

        char alternativa = scanner.next().charAt(0);

        switch (alternativa){

            case 'a':
            if (alternativa == 'a'){ 
                System.out.println("Parabéns, você acertou!");
            };
            break;
            case 'b':
                if (alternativa != 'a'){ 
                System.out.println("Você errou, a alternativa certa é a A.");
            };
            break;
            case 'c':
                if (alternativa != 'a'){ 
                System.out.println("Você errou, a alternativa certa é a A.");
            };
            break;

            case 'd':
                if (alternativa != 'a'){ 
                System.out.println("Você errou, a alternativa certa é a A");
            };
            break;

            default:
                System.out.println("Digite uma alternativa válida!");
        }
        
        if (alternativa == 'a'){ 

            System.out.println("Deseja seguir para a próxima questão? Responda com true ou false");
            boolean continuar = true;
            continuar = scanner.nextBoolean();

        while(continuar==true){

            System.out.println("Em formulação...");
            break;
            }
        
        }    
    }
}
        
        
        
        
        
        
        
        
   



