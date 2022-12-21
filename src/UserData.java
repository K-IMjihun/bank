import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {
  static Scanner sc = new Scanner(System.in);
  static String name = "";
  static String RRN = "";
  static String ID = "";
  static String PW = "";
  static String money = "0";
  static List<String> userData;
  static List<List<String>> userDatas = new ArrayList<>();

  public static void createID() {
    System.out.println("이름을 입력해주세요");
    name = sc.next();
    nameException(name);
    System.out.println("주민등록번호를 - 없이 입력해주세요");
    RRN = sc.next();
    RRNException(RRN);
    System.out.println("아이디를 입력해 주세요");
    System.out.println("아이디는 1자리 이상, 10자리 이하만 가능합니다");
    ID = sc.next();
    IDException(ID);
    System.out.println("패스워드를 입력해 주세요");
    System.out.println("패스워드는 1자리 이상, 10자리 이하만 가능합니다");
    PW = sc.next();
    PWException(PW);

    userData = List.of(name, RRN, ID, PW, money);
    userDatas.add(userData);
    System.out.println(name + "님. 회원가입이 완료되었습니다.\n");
  }
  public static List<List<String>> getUserDatas(){return userDatas;  }
  public static void nameException(String name){
    //한글인지, 숫자가 포함되어 있는지
  };
  public static void RRNException(String RRN){
    //한글인지, 숫자가 포함되어 있는지
    //가입된 주민번호가 있을 시, 양식이 지켜지지 않았을 시
  };
  public static void IDException(String ID){
    if(ID.length() > 10 || ID.length() < 1){
      throw new IllegalArgumentException("ERROR : 1 ~ 10글자만 가능합니다");
    }
    for(int i = 0; i < userDatas.size(); i++){
      if (userDatas != null && userDatas.get(i).get(2).contains(ID)) {
        throw new IllegalArgumentException("ERROR : 이미 사용중인 아이디 입니다.");
      }
    }
  }
  public static void PWException(String PW) {
    if (PW.length() > 10 || PW.length() < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 10자리만 가능합니다");
    }
  }
}
