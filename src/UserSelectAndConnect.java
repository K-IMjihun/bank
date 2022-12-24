public class UserSelectAndConnect {
  static UserData userData = new UserData();
  static FindIDAndPW findIDAndPW = new FindIDAndPW();
  static LogInAndLogOut logInAndLogOut = new LogInAndLogOut();
  static boolean logInCheck = false;   //false = 로그아웃 상태, true = 로그인 상태
  static CreateUserData loginUserData; //로그인 시 개인정보 저장

  public static void userSelect(String userSelect) {
    if (userSelect.length() != 1) {
      throw new IllegalArgumentException("ERROR : 입력오류");
    }
    if (!Character.isDigit(userSelect.charAt(0))) {
      throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
    }
    if (Integer.parseInt(userSelect) > 9 || Integer.parseInt(userSelect) < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 9 사이의 숫자를 입력해 주세요");
    }
    Connect(userSelect);
  }
  public void setLoginUserData(CreateUserData loginUserData){
    this.loginUserData = loginUserData;
  }
  public static CreateUserData getLoginUserData(){ return loginUserData; }

  public static void Connect(String userSelect) {
    if(Integer.parseInt(userSelect) >= 1 && Integer.parseInt(userSelect) <= 3 && logInCheck == true){
      System.out.println("로그인 상태입니다.\n");
    }
    else if(userSelect.equals("1")){
      userData.createID();
    }
    else if(userSelect.equals("2")) {
      findIDAndPW.findIDAndPW();
    }
    else if(userSelect.equals("3")) {
      logInCheck = logInAndLogOut.logIn();
    }
    if(Integer.parseInt(userSelect) >= 4 && Integer.parseInt(userSelect) <= 8 && logInCheck == false) {
      System.out.println("로그인이 필요한 서비스입니다. 로그인 후 이용해주세요\n");
    }
    else if(userSelect.equals("4")) {
      logInCheck = logInAndLogOut.logOut();
    }
    else if(userSelect.equals("5")) {
      loginUserData.setMoney(transfer.deposit());
    }
    else if(userSelect.equals("6")){
      loginUserData.setMoney(transfer.withdraw());
    }
    else if(userSelect.equals("7")){
      loginUserData.setMoney(transfer.remittance());
    }
    else if(userSelect.equals("8")){
      System.out.println("현재잔고 : " + loginUserData.getMoney() + "원");
      
    }
    }
}
