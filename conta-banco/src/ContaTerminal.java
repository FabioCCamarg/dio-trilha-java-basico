import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Tipo e Atributos
        int number;
        String agency;
        String nameClient;
        float balance;

        //Instanciando a Classe Scanner para captura dos dados digitados.
        Scanner sc = new Scanner(System.in);
        
        //Entrada usuário
        System.out.println("Por favor, digite o número da Agência !");
        agency = sc.next(); 
        System.out.println("Digite o número da sua conta !");
        number = sc.nextInt(); 
        System.out.println("Digite o seu nome !");
        nameClient = sc.next(); 
        System.out.println("Digite seu saldo !");
        balance = sc.nextFloat(); 

        //Saída usuário
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nameClient, agency, number, balance);
    }
    
}
