public class main {
    public static void main(String[] args) {
        Cliente fylipe= new Cliente();
        fylipe.setNome("FYLIPE");

        Conta cc= new ContaCorrente(fylipe);
        cc.depositar(100);
        Conta cp=new ContaPoupanca(fylipe);
         
        cc.transferir(cp, 100);

       cc.extrato();
       cp.extrato();
    }
}
