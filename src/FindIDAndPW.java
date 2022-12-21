import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindIDAndPW {
  static UserData userData = new UserData();

  public static void findIDAndPW() {
    Scanner sc = new Scanner(System.in);
    System.out.println("이름을 입력해 주세요");
    String name = sc.next();
    System.out.println("주민번호를 입력해 주세요");
    String RRN = sc.next();
    IDAndPWCompare(name, RRN);
  }
  public static void IDAndPWCompare(String name, String RRN){
    List<List<String>> userInfos = new ArrayList<>(userData.getUserDatas());
    for (int i = 0; i < userInfos.size(); i++) {
      if (userInfos.get(i).get(0).contains(name)) {
        if (userInfos.get(i).get(1).contains(RRN)) {
          System.out.println("아이디는 " + userInfos.get(i).get(2) + ", 비밀번호는 " + userInfos.get(i).get(3) + "입니다.\n");
          break;
        }
        if (i == userInfos.size() - 1 && !userInfos.get(i).get(1).contains(RRN)) {
          System.out.println("일치하는 정보가 없습니다"); // 이름은 있으나 주민번호가 존재하지 않을 시
        }
      }
      if (i == userInfos.size() - 1 && !userInfos.get(i).get(0).contains(name)) {
        System.out.println("등록되지 않은 정보입니다"); // 이름이 존재하지 않을 시
      }
    }

  }
}
