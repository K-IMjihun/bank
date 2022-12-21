import java.util.Scanner;

public class Main {
  static String select = "";
  public static void main(String[] args) {
    while(!select.equals("9")) {
      Scanner sc = new Scanner(System.in);
          System.out.println(
              "XX은행입니다. 원하시는 항목을 선택해주세요\n" +
              "1. 회원가입\n" +
              "2. 아이디 / 비밀번호 찾기\n" +
              "3. 로그인 \n" +
              "4. 로그아웃 \n" +
              "5. 입금\n" +
              "6. 송금\n" +
              "7. 출금\n" +
              "8. 잔액확인\n" +
              "9. 종료");
          select = sc.next();
          UserSelectAndConnect.userSelect(select);
    }
  }
}