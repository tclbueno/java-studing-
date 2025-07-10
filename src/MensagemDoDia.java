
import java.util.Scanner;

public class MensagemDoDia{
    public static void main(String[] args) {
       int numero;
       
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um núemro de 1 a 10:");
         numero = scanner.nextInt();

         if(numero >= 1 && numero <=5){
            System.out.println("Se não arriscarmos, não criamos o futuro! -Luffy (One Piece)");
            } else if (numero >= 6 && numero <= 10){
                System.out.println("Levante a cabeça, prossiga com sua vida. Você tem suas próprias pernas para poder andar, então use-as! -Edward Elric (Fullmetal Alchemist)");       
         }else{
                System.out.println("Informe uma opção válida!");
             
         }
        
    }

}
