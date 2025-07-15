import java.util.Scanner;

public class CalculadoraSalario{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor que você recebe por hora: ");
            double valorHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas que você trabalha na semana: ");
            double quantidadeDeHoras = scanner.nextDouble(); 
        System.out.println("Digite a quantidade de dias que você trabalhou no mês: ");
            int diasTrabalhados = scanner.nextInt();

        System.out.println("Seu salário é de R$" + CalcularSalario(valorHora, quantidadeDeHoras,diasTrabalhados));
    }

public static double CalcularSalario(double valorHora, double quantidadeDeHoras, int diasTrabalhados){

    double valorSalario = (valorHora*quantidadeDeHoras)*diasTrabalhados;

        return valorSalario;
    
    }

}

