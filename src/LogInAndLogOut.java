import java.util.HashMap;
import java.util.Scanner;

public class LogInAndLogOut {
  static Scanner sc = new Scanner(System.in);
  static CreateID createID = new CreateID();
  static HashMap<String, String> IDAndPW;
  public static boolean logIn(){
    IDAndPW = new HashMap<>(createID.getIDAndPW());
    System.out.println("아이디를 입력해 주세요");
    String ID = sc.next();
    if(createID.getIDAndPW().containsKey(ID)){
      System.out.println("비밀번호를 입력해 주세요");
      if(IDAndPW.get(ID).equals(sc.next())) {
        System.out.println("로그인 되었습니다.");
        return true;
      }
      else{
        System.out.println("비밀번호가 틀렸습니다. 다시 확인해 주세요");
      }
    }
    else{
      System.out.println("등록되지 않은 아이디 입니다. 아이디를 확인해 주세요");
    }
    return false;
  }
  public static boolean logOut(){
    System.out.println("로그아웃 되었습니다.");
    return false;
  }
}
