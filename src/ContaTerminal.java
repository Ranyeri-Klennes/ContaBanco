import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente!");
        String nome_cliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta!");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
