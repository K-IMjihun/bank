package service;

import dto.DepositAndWithdrawDTO;

public class Deposit {
  public static void deposit(DepositAndWithdrawDTO transferUser) {
    transferUser.setMoney(transferUser.getMoney() + transferUser.getBalance());
    System.out.println(
        "입금되었습니다. \n" +
            "현재잔고 : " + transferUser.getMoney());
  }
}
