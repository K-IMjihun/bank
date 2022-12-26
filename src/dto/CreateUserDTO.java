package dto;

public class CreateUserDTO { // Model
  private String name;
  private String RRN;
  private String ID;
  private String PW;
  private long money;

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

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

  public CreateUserDTO(String name, String RRN, String ID, String PW) {
    this.name = name;
    this.RRN = RRN;
    this.ID = ID;
    this.PW = PW;
  }

}