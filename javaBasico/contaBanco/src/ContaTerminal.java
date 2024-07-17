public class ContaTerminal{
    String numeroConta;
    String agencia;
    String nomeCliente;
    float saldo;

    public ContaTerminal(String numeroConta, String agencia, String nomeCliente, float saldo){
        this.numeroConta= numeroConta;
        this.agencia= agencia;
        this.nomeCliente= nomeCliente;
        this.saldo= saldo;
      
    }

    public void ApresentaDados(){

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque!");

    }

}
