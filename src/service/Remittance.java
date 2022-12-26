package service;

import database.UserData;
import dto.RemittanceDTO;

public class Remittance {
  public static void remittance(RemittanceDTO remittance) {
    if(UserData.getUserByAccountNumber(remittance.getRemittanceAccount()) == null) {
      System.out.println("계좌를 한번 더 확인해주세요");
    }
    if(remittance.getUserMoney() < remittance.getTransferMoney()){
      System.out.println("송금금액이 잔액보다 큽니다.");
    }
    else {
      UserData.getUserByAccountNumber(remittance.getRemittanceAccount()).setMoney(remittance.getTransferMoney());
      System.out.println(
          remittance.getTransferMoney() +"원 송금되었습니다 \n"+
              "현재잔고 : " + (remittance.getUserMoney() - remittance.getTransferMoney()));
    }
}

}
