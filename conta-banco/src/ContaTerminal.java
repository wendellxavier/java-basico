import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 237.48;

        System.out.println("Por favor digite o numero da Agencia: ");
        int numero =  scanner.nextInt();

        System.out.println("Digite á agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();


        System.out.println(" Ola " + nomeCliente + " obrigado por criar umma conta em nosso banco, sua agência é " + agencia + ", conta " +  numero + " e seu saldo " +  saldo + " já está disponivel ");
        

    }

    
}
