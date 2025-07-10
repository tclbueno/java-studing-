



public class FichaCadastral {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Tainara";
        String ultimoNome = "Bueno";
        int idade = 26;
        String dataNascimento = "27-05-1999";
        double altura = 1.57;
        boolean possuiCNH = true;


        System.out.println("***** Ficha Cadastral *****");
        System.out.println("Nome: " + primeiroNome + " " + ultimoNome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Possui CNH: " + (possuiCNH ? "Sim" : "Não"));
        System.out.println("A primeira letra de seu nome é: " + primeiroNome.charAt(0)); // Imprimindo o primeiro caractere do primeiro nome
        System.out.println("A ultima letra de seu nome é: " + primeiroNome.charAt(primeiroNome.length()-1)); // Imprimindo o último caractere do primeiro nome
        System.out.println("Seu primeitro nome tem " + primeiroNome.length() + " letras"); // Imprimindo o tamanho do primeiro nome
        System.out.println("Seu ultimo nome tem " + ultimoNome.length() + " letras"); // Imprimindo o tamanho do último nome
        System.out.println("Seu nome completo tem " + (primeiroNome.length() + ultimoNome.length()) + " letras"); // Imprimindo o tamanho do nome completo
        System.out.println(primeiroNome.equals("Tatiana")); // Verificando se o primeiro nome é igual a "Tatiana"
    }
}
