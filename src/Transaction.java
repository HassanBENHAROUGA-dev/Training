public class Transaction {
    private String type; // ex: "CREDIT", "DEBIT"
    private double amount; // ex: 1000.50

    // (Imagine que les getters getType() et getAmount() existent)


    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
