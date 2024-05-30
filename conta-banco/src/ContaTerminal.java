import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: \n");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o número da sua agência: \n");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome: \n");
        scanner.nextLine();
        
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: \n");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
