import java.util.Scanner;

public class Main {
  UserSelectAndConnect userSelectAndConnect = new UserSelectAndConnect();
  static boolean logInCheck = false;
  public static void main(String[] args) {
    while(true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("XX은행입니다. 원하시는 번호를 입력해주세요");
      System.out.println("1. 회원가입");
      System.out.println("2. 아이디 / 비밀번호 찾기");
      System.out.println("3. 로그인");
      System.out.println("4. 로그아웃");
      System.out.println("5. 입금");
      System.out.println("6. 출금");
      System.out.println("7. 잔액확인");
      System.out.println("8. 종료");
      String userSelect = sc.next();
      UserSelectAndConnect.userSelect(userSelect);
      if(userSelect.equals("8")){
        break;
      }
    }
  }
}