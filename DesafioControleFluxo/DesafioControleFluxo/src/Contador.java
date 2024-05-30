import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();

        try{
            contar(num1, num2);
        }catch(ParametrosInvalidosException e){
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2 ) throws ParametrosInvalidosException {
		if(num1 > num2){
            throw new ParametrosInvalidosException();
        }
		
		int cont = num1 - num2;
		for(int i = 0; i<cont; i++){
            System.out.println("\nImprimindo o número " + cont);
        }
	}

}
