package service;

import dto.DepositAndWithdrawDTO;

public class Withdraw {
  public static void withdraw(DepositAndWithdrawDTO transferUser) {
    if(transferUser.getMoney() > transferUser.getBalance()) { // 잔금보다 출금액이 클 시
      System.out.println("잔고를 다시 확인해주세요");
    }
    else {
      transferUser.setMoney(transferUser.getBalance() - transferUser.getMoney());
      System.out.println(
          "출금되었습니다. \n" +
              "현재잔고 : " + transferUser.getMoney());
    }
    }
}
