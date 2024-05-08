import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da CONTA:");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o número da AGÊNCIA:");
        String agencia = sc.next();

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.next();

        System.out.println("Digite seu Saldo:");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por ter criado uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + conta + " e seu saldo " + saldo + " já disponível para saque.");

    }
}
