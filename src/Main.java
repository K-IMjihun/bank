import database.UserData;
import dto.*;
import entity.User;
import service.Deposit;
import service.FindIDAndPW;
import service.Remittance;
import service.Withdraw;

import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static UserData userData = new UserData();
  static String select = "";
  static boolean loginCheck;
  static User loginUserData = new User();
  static Long transferMoney;

  public static void main(String[] args) {
    while(!select.equals("9")) {
      Scanner sc = new Scanner(System.in);
      if (loginCheck == false) { // 로그인 하기 전
        System.out.println(
            "XX은행입니다. 원하시는 항목을 선택해주세요\n" +
            "1. 회원가입\n" +
            "2. 로그인 \n" +
            "3. 아이디 / 비밀번호 찾기\n" +
            "9. 종료\n");
        select = sc.next();
        logoutConnect(select);
      }
      else {
        System.out.println(
            "이용하실 서비스 항목을 선택해주세요, \n" +
            "1. 입금\n" +
            "2. 출금\n" +
            "3. 송금\n" +
            "4. 잔액확인\n" +
            "5. 로그아웃 \n" +
            "9. 종료");
        select = sc.next();
      loginConnect(select);
      }
    }
      }
  public static void logoutConnect(String userSelect) {
    switch (userSelect) {
      case "1": createUser();
        break;
      case "2": login();
        loginCheck = true;
        break;
      case "3": findUser();
        break;
      case "9":
        System.out.println("프로그램을 종료합니다");
        break;

      default:
        throw new IllegalArgumentException("ERROR : 올바른 값을 입력해주세요");
    }
  }
  public static void loginConnect(String userSelect) {
    switch (userSelect) {
      case "1": deposit();
      break;
      case "2": withdraw();
      break;
      case "3": remittance();
      break;
      case "4" :
        System.out.println(loginUserData.getName() + "님의 현재 잔액 : " + loginUserData.getMoney() + " 원");
      break;
      case "5": loginCheck = false;
                loginUserData = null;
      break;
      case "9":
        System.out.println("프로그램을 종료합니다");
        break;
      default:
        throw new IllegalArgumentException("ERROR : 올바른 값을 입력해주세요");
    }
  }

  private static void createUser() {
    System.out.println("이름을 입력해주세요");
    String name = sc.next();
    System.out.println("주민등록번호를 - 없이 입력해주세요");
    String RRN = sc.next();
    System.out.println("아이디를 입력해 주세요");
    String ID = sc.next();
    System.out.println("패스워드를 입력해 주세요");
    String PW = sc.next();
    CreateUserDTO createUser = new CreateUserDTO(name, RRN, ID, PW);
    User user = User.createUser(createUser, userData.getAccountNumber());
    userData.createUser(user);
  }

  private static void login(){
    System.out.println("ID 입력");
    String ID = sc.next();
    System.out.println("PW 입력");
    String PW = sc.next();
    LoginDTO loginUser = new LoginDTO(ID, PW);
    loginUserData = service.Login.login(loginUser);
  }

  private static void findUser() {
    System.out.println("이름을 입력");
    String name = sc.next();
    System.out.println("주민번호 입력");
    String RRN = sc.next();
    FindUserDTO findUser = new FindUserDTO(name, RRN);
    FindIDAndPW.IDAndPWCompare(findUser);
  }

  public static void deposit(){
    System.out.println("입금하실 금액을 입력하세요");
    transferMoney = sc.nextLong();
    DepositAndWithdrawDTO transferUser = new DepositAndWithdrawDTO(transferMoney, loginUserData.getMoney());
    Deposit.deposit(transferUser);
    loginUserData.setMoney(loginUserData.getMoney() + transferMoney);
  }
  public static void withdraw(){
    System.out.println("출금하실 금액을 입력하세요");
    transferMoney = sc.nextLong();
    DepositAndWithdrawDTO transferUser = new DepositAndWithdrawDTO(transferMoney, loginUserData.getMoney());
    Withdraw.withdraw(transferUser);
    if(loginUserData.getMoney() > transferMoney){
      loginUserData.setMoney(loginUserData.getMoney() - transferMoney);
    }
  }
  public static void remittance(){
    System.out.println("송금하실 계좌를 입력해주세요");
    String remittanceAccount = sc.next();
    System.out.println("송금할 금액을 입력해주세요");
    transferMoney = sc.nextLong();
    RemittanceDTO remittance = new RemittanceDTO(remittanceAccount, transferMoney, loginUserData.getMoney());
    Remittance.remittance(remittance);
    if(loginUserData.getMoney() > transferMoney && UserData.getUserByAccountNumber(remittanceAccount) != null){
      loginUserData.setMoney(loginUserData.getMoney() - transferMoney);
    }

    }
}