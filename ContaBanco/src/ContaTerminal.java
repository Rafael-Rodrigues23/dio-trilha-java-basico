import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número Conta !");
        int numero = sc.nextInt();
        System.out.println(numero);

        System.out.println("Por favor, digite o número Agência !");
        String agencia = sc.nextLine();
        System.out.println(agencia);

        System.out.println("Por favor, digite o seu Nome !");
        String nome = sc.nextLine();
        System.out.println(nome);

        System.out.println("Por favor, digite o seu saldo atual !");
        Double saldo = sc.nextDouble();
        System.out.println(saldo);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");12
    }
}
