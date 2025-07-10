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
    }
}
