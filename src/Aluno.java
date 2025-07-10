
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        
    
    String nome;
    double primeiraNota;
    double segundaNota;
    double media;

    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o nome do aluno(a): ");
        nome = scanner.nextLine();
    System.out.println("Digite a primeira nota do aluno: ");
        primeiraNota = scanner.nextDouble();
    System.out.println("Digite a segunda nota do aluno: ");
        segundaNota = scanner.nextDouble();

    media = (primeiraNota + segundaNota) / 2;

    System.out.println("A media do aluno(a) "+nome+" é: "+media);

    }
 }

