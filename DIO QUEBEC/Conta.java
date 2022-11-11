public abstract class Conta implements Iconta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int numConta;
    
    protected int agencia;
    
    protected double saldo;

    private Cliente cliente;

    public Conta( Cliente cliente) {
        this.agencia= AGENCIA_PADRAO;
        this.numConta= SEQUENCIAL++;
        this.cliente=cliente;
        
    }

  @Override
    public void sacar(double valor) {
        saldo=saldo-valor;
        
    }
    @Override
    public void depositar(double valor) {
        saldo=saldo+valor;
        
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
   
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular da conta: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero da conta: %d",this.numConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }

    public int getNumConta() {
        return numConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    

    
    
}
