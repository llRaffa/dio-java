import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);
              Conta bc = new Conta();

       System.out.println("digite seu nome");
       bc.cliente = digito.nextLine();
       System.out.println("digite seu numero");
       bc.numero = digito.nextInt();
       digito.nextLine();
       System.out.println("digite seu agencia");
       bc.agencia = digito.nextLine();

       bc.saldo = 100.430;
       bc.status();
    }
}