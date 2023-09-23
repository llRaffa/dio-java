public class Conta {
    //atributos
    public String cliente;
    public String agencia;

    public int numero;

    public double saldo;

    public void status() {
       System.out.println("Olá [" + cliente + "], obrigado por criar uma conta em nosso banco, " +
               "sua agência é [" + agencia + "], conta [ " + numero + "] e seu saldo [" + saldo + "] já está disponível para saque");

}
}
