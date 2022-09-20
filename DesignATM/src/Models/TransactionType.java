package Models;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;
    public static void getAllTransactionTypes() {
        for (TransactionType type:TransactionType.values()) System.out.println(type.name());

    }
}
