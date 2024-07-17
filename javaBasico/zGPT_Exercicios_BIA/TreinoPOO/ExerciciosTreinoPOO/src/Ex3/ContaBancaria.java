package Ex3;

public class ContaBancaria {
    int numeroConta;
    String nomeBeneficiario;
    double saldoConta= 0;

    public void depositar(double deposito){
        saldoConta += deposito;
    }
    
    public void sacar(double saque){
        saldoConta -= saque;
    }

    public void verificarSaldo(){
        System.out.println("Olá "+nomeBeneficiario+" o Saldo atual da sua conta "+numeroConta+" é: "+ saldoConta);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta= 785369;
        conta.nomeBeneficiario= "Felipe";
        conta.saldoConta= 5000;

        conta.sacar(250);
        conta.verificarSaldo();

        conta.depositar(800);
        conta.verificarSaldo();



    }
}
