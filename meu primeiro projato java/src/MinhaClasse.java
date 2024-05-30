import java.util.Scanner;
import java.util.Locale;

public class MinhaClasse {
    
    public static void main(String [] args){
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome_usuario = scanner.next();

        System.out.println("Seu nome eh: " + nome_usuario);
    }

}
