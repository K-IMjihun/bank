import java.util.Scanner;

public class UserSelectAndConnect {
  static Scanner sc = new Scanner(System.in);
  static boolean logInCheck = false;  //false = 로그아웃 상태, true = 로그인 상태
  static CreateID createID = new CreateID();
  static FindIDAndPW findIDAndPW = new FindIDAndPW();
  static LogInAndLogOut logInAndLogOut = new LogInAndLogOut();
  static Deposit deposit = new Deposit();

  public static void userSelect(String userSelect) {
    if (userSelect.length() != 1) {
      throw new IllegalArgumentException("ERROR : 입력오류");
    }
    if (!Character.isDigit(userSelect.charAt(0))) {
      throw new IllegalArgumentException("ERROR : 숫자만 입력 가능");
    }
    if (Integer.parseInt(userSelect) > 6 || Integer.parseInt(userSelect) < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 6 사이의 숫자를 입력해 주세요");
    }
    Connect(userSelect);
  }

  public static void Connect(String userSelect) {
    switch (userSelect){
      case "1" : createID.createID();
        break;
      case "2" : findIDAndPW.findIDAndPW();
        break;
      case "3" : logInCheck = logInAndLogOut.logIn();
        break;
      case "4" :
        if (logInCheck == false) {
          System.out.println("로그인이 필요한 서비스입니다");
        }
        else{
          logInCheck = logInAndLogOut.logOut();
        }
        break;
      case "5" :
        if (logInCheck == false) {
          System.out.println("로그인이 필요한 서비스입니다");
        }
        else{

        }
        break;
      }
    }
}
