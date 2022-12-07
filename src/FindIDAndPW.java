import java.util.HashMap;
import java.util.Scanner;

public class FindIDAndPW {
  static Scanner sc = new Scanner(System.in);
  static CreateID createID = new CreateID();

  public static void findIDAndPW() {
    System.out.println("아이디 찾기를 원하시면 1, 비밀번호 찾기를 원하시면 2를 입력해 주세요");
    String idAndPWFind = sc.next();
    IDAndPWexception(idAndPWFind);
    if (idAndPWFind.equals("1")) {
      //회원가입 시 개인정보 구문 추가
      findID();
    }
    if (idAndPWFind.equals("2")) {
      findPW();
    }

  }

  public static void IDAndPWexception(String IDAndPW) {
    if (IDAndPW.length() != 1) {
      throw new IllegalArgumentException("잘못된 값 입력");
    }
    if (!Character.isDigit(IDAndPW.charAt(0))) {
      throw new IllegalArgumentException("숫자만 입력 가능");
    }
    if (Integer.parseInt(IDAndPW) != 1 && Integer.parseInt(IDAndPW) != 2) {
      throw new IllegalArgumentException("ERROR : 1, 2만 입력 가능");
    }
  }

  public static void findID() {

  }

  public static void findPW() {
    System.out.println("아이디를 입력해 주세요");
    String ID = sc.next();
    HashMap<String, String> findID = new HashMap<>(createID.getIDAndPW());
    if (findID.containsKey(ID)) {
      System.out.println("패스워드는 " + findID.get(ID) + " 입니다");
    }
    else{
      System.out.println("아이디를 한번 더 확인해 주세요");
    }
  }
}
