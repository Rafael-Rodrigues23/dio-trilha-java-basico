import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println(conta);

    }
}
