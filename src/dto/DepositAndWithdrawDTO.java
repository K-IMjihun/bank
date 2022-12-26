package dto;

public class DepositAndWithdrawDTO {
  private long money;   //입금금액
  private long balance; //통장잔고

  public DepositAndWithdrawDTO(long money, long balance) {
    this.money = money;
    this.balance = balance;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
}
