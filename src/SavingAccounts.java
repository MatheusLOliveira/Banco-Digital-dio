public class SavingAccounts extends Account{

    public SavingAccounts(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.printCommonInfos();
    }

}
