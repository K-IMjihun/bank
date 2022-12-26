package database;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData { // 유저 정보를 가지고 있는 테이블
  public static List<User> userDataList = new ArrayList<>();
  private String accountNumber = "1";

  public void createUser(User createUser) {
    userDataList.add(createUser);
    this.accountNumber = String.valueOf(Integer.parseInt(this.accountNumber)+1);
    System.out.println(createUser.getName() + "님. 회원가입이 완료되었습니다.\n");
  }

  public static User getUserByAccountNumber(String accountNumber) {
    for (User user : userDataList) {
      if (user.getAccountNumber().equals(accountNumber)) {
        return user;
      }
    }
    return null;
  }

  public String getAccountNumber() {
    return accountNumber;
  }
}
