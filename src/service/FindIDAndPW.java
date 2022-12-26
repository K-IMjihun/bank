package service;

import database.UserData;
import dto.FindUserDTO;
import entity.User;

public class FindIDAndPW {

  public static void IDAndPWCompare(FindUserDTO findUser) {
    for (User user : UserData.userDataList) {
      if (user.getName().equals(findUser.getName()) && user.getRRN().equals(findUser.getRRN())) {
        System.out.println("아이디는 " + user.getID() + ", 비밀번호는 " + user.getPW() + " 입니다\n");
        return;
      }

      System.out.println(user.getName() + " " + user.getRRN());
    }
    System.out.println("이름과 주민번호를 다시한번 더 확인해주세요");
  }
}

