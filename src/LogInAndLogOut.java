import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogInAndLogOut {
  static Scanner sc = new Scanner(System.in);
  static UserData userData = new UserData();
  public static boolean logIn(){
    System.out.println("아이디를 입력해 주세요");
    String ID = sc.next();
    System.out.println("비밀번호를 입력해 주세요");
    String PW = sc.next();
    List<List<String>> userInfos = new ArrayList<>(userData.getUserDatas());
    for (int i = 0; i < userInfos.size(); i++) {
      if (userInfos.get(i).get(2).contains(ID)) {
        if (userInfos.get(i).get(3).contains(PW)) {
          System.out.println(userInfos.get(i).get(0) + "님. 로그인 되었습니다\n");
          return true;
        }
        if (i == userInfos.size() - 1 && !userInfos.get(i).get(3).contains(PW)) {
          System.out.println("비밀번호가 틀렸습니다. 다시 확인해 주세요");// 이름은 있으나 주민번호가 존재하지 않을 시
        }
      }
      if (i == userInfos.size() - 1 && !userInfos.get(i).get(2).contains(ID)) {
        System.out.println("등록되지 않은 아이디 입니다. 아이디를 확인해 주세요"); // 이름이 존재하지 않을 시
      }
    }
    return false;
  }
  public static boolean logOut(){
    System.out.println("로그아웃 되었습니다.\n");
    return false;
  }
}
