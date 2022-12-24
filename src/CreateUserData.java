public class CreateUserData {
  private String name;
  private String RRN;
  private String ID;
  private String PW;
  private int money;
  private int accountNumber;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getRRN() {
    return RRN;
  }
  public void setRRN(String RRN) {
    this.RRN = RRN;
  }

  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  public String getPW() {
    return PW;
  }
  public void setPW(String PW) {
    this.PW = PW;
  }

  public int getMoney(){
    return money;
  }
  public void setMoney(int money){
    this.money = money;
  }

  public int getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CreateUserData(String name, String RRN, String ID, String PW, int money, int accountNumber) {
    this.name = name;
    this.RRN = RRN;
    this.ID = ID;
    this.PW = PW;
    this.money = money;
    this.accountNumber = accountNumber;
  }

}