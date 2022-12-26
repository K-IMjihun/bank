package entity;

import database.UserData;
import dto.CreateUserDTO;

public class User {

  private String name;
  private String RRN;
  private String ID;
  private String PW;
  private String accountNumber;
  private long money;

  public User() {
  }

  public User(String name, String RRN, String ID, String PW, String accountNumber, long money) {
    this.name = name;
    this.RRN = RRN;
    this.ID = ID;
    this.PW = PW;
    this.accountNumber = accountNumber;
    this.money = money;
  }

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

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

  public static User createUser(CreateUserDTO createUser, String accountNumber) {
    User user = new User();

    nameException(createUser.getName());
    user.setName(createUser.getName());

    IDException(createUser.getID());
    user.setID(createUser.getID());

    PWException(createUser.getPW());
    user.setPW(createUser.getPW());

    RRNException(createUser.getRRN());
    user.setRRN(createUser.getRRN());

    user.setMoney(createUser.getMoney());
    user.setAccountNumber(accountNumber);

    return user;
  }

  private static void nameException(String name){
    //한글인지, 숫자가 포함되어 있는지
  }
  private static void RRNException(String RRN){
    //한글인지, 숫자가 포함되어 있는지
    //가입된 주민번호가 있을 시, 양식이 지켜지지 않았을 시
  }
  private static void IDException(String ID){
    if(ID.length() > 10 || ID.length() < 1){
      throw new IllegalArgumentException("ERROR : 1 ~ 10글자만 가능합니다");
    }
    for(User userData : UserData.userDataList) {
      if (userData.getID().equals(ID)) {
        throw new IllegalArgumentException("ERROR : 사용중인 아이디입니다.");
      }
    }
  }
  private static void PWException(String PW) {
    if (PW.length() > 10 || PW.length() < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 10자리만 가능합니다");
    }
  }


}
