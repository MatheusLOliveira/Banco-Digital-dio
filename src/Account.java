public abstract class Account implements IAccount{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double valor) {
        balance -= valor;
    }

    @Override
    public void deposit(double valor) {
        balance += valor;
    }

    @Override
    public void transfer(double value, IAccount destinyAccount) {
        this.withdraw(value);
        destinyAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfos() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
