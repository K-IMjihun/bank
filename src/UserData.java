import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {
  static List<CreateUserData> userDatas = new ArrayList<>();
  static Scanner sc = new Scanner(System.in);
  static int accountNumber = 1;
  public static void createID() {
    System.out.println("이름을 입력해주세요");
    String name = sc.next();
    nameException(name);
    System.out.println("주민등록번호를 - 없이 입력해주세요");
    String RRN = sc.next();
    RRNException(RRN);
    System.out.println("아이디를 입력해 주세요");
    String ID = sc.next();
    IDException(ID);
    System.out.println("패스워드를 입력해 주세요");
    String PW = sc.next();
    PWException(PW);
    userDatas.add(new CreateUserData(name, RRN, ID, PW,0, accountNumber));
    accountNumber++;
    System.out.println(name + "님. 회원가입이 완료되었습니다.\n");
  }
  public static List<CreateUserData> getUserDatas(){
    return userDatas;
  }
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
    for(CreateUserData userData : userDatas) {
      if (userData.getID().equals(ID)) {
        throw new IllegalArgumentException("ERROR : 사용중인 아이디입니다.");
    }
    }
  }
  public static void PWException(String PW) {
    if (PW.length() > 10 || PW.length() < 1) {
      throw new IllegalArgumentException("ERROR : 1 ~ 10자리만 가능합니다");
    }
  }
}
