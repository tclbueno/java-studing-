
import java.util.Scanner;

public class ReproduçãoMusica {
    public static void main(String[] args) {
        boolean repeat = true;
        
        while (repeat == true){
            System.out.println("Solta o som DJ!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Devo repetir a musica? (Responder com true or false)");
            repeat = scanner.nextBoolean();
        }
            System.out.println("Encerrando...");
    }
    
}
