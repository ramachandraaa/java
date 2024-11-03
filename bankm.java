class bankm{
    private double balance;
    public bankm(double rembalance)
    {
        this.balance=rembalance;
    }
    public double deposit( double amount)
    {
      this.balance=amount+this.balance;
       return balance;

    }
    public double withdraw(double amount)
    {
this.balance =this.balance-amount;
return balance;
    }
}
