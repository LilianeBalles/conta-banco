import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroConta ;
        String agencia ;
        String nomeCliente;
        double saldo ;

        System.out.println(" Digite o número da Agência");
        agencia = scanner.next();
        
        System.out.println(" Digite o número da conta ");
        numeroConta = scanner.nextInt();

        System.out.println(" Digite o nome do Cliente ");
        nomeCliente = scanner.next();

        System.out.println(" digite o saldo ");
        saldo = scanner.nextDouble();

        System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo é " + saldo + " disponível para saque");

    }
}
