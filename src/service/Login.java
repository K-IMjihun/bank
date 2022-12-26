package service;

import database.UserData;
import dto.LoginDTO;
import entity.User;
public class Login {
  public static User login(LoginDTO loginUser){
    for(User user : UserData.userDataList){
      if(user.getID().equals(loginUser.getID()) &&
          user.getPW().equals(loginUser.getPW())){
          System.out.println(user.getName() + "님 로그인 되었습니다\n");
          return user;
      }
    }
    return null;
  }
}
