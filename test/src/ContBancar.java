public class ContBancar{
    private String Account_number;
    private double sold;

    public ContBancar(String Account_number, double sold){
       this.Account_number = Account_number;
       this.sold = sold;
    }

    public String getAccount_number(){
        return Account_number;
    }

    public double getSold() {
        return sold;
    }

    public void setAccount_number(String account_number) {
        Account_number = account_number;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
