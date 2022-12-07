import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CreateID {
  static Scanner sc = new Scanner(System.in);

  static int money = 0;
  static String ID;
  static HashMap<String, String> IDAndPW = new HashMap<>();

  public static void createID() {
    System.out.println("아이디를 입력해 주세요");
    System.out.println("아이디는 1자리 이상, 10자리 이하만 가능합니다");
    ID = sc.next();
    IDexception(ID);
    createPW();
  }
  public static void createPW() {
    System.out.println("패스워드를 입력해 주세요");
    System.out.println("패스워드는 1자리 이상, 10자리 이하만 가능");
    String PW = sc.next();
    PWexception(PW);
    IDAndPW.put(ID, PW);
    System.out.println(IDAndPW);
  }
  public static void IDexception(String ID){
    if(ID.length() > 10 || ID.length() < 1){
      throw new IllegalArgumentException("ERROR : 1 ~ 10글자만 가능합니다");
    }
    if(IDAndPW != null && IDAndPW.containsKey(ID)){
      throw new IllegalArgumentException("ERROR : 이미 사용중인 아이디 입니다.");
    }
  }
  public static void PWexception(String PW) {
    if (PW.length() > 10 || PW.length() < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 10자리만 가능합니다");
    }
  }
  public static HashMap getIDAndPW(){
    return IDAndPW;
  }
}
