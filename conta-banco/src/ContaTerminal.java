import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //criando o objeto scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        //recebendo os valores
        System.out.println("Por favor, digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();

        System.out.println("Digite a agência para a conta: ");
        String agencia = input.next();

        System.out.println("Digite o saldo para a conta: ");
        double saldo = input.nextDouble();

        //exibindo o resultado
        String resultado = "Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.";
        System.out.println(resultado);
    }
}