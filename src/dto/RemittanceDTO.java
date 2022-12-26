package dto;

public class RemittanceDTO {
  private String remittanceAccount;
  private Long transferMoney;
  private Long userMoney;

  public RemittanceDTO(String remittanceAccount, Long remittanceAmount, Long userMoney) {
    this.remittanceAccount = remittanceAccount;
    this.transferMoney = remittanceAmount;
    this.userMoney = userMoney;
  }

  public String getRemittanceAccount() {
    return remittanceAccount;
  }

  public void setRemittanceAccount(String remittanceAccount) {
    this.remittanceAccount = remittanceAccount;
  }

  public Long getTransferMoney() {
    return transferMoney;
  }

  public void setTransferMoney(Long transferMoney) {
    this.transferMoney = transferMoney;
  }

  public Long getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(Long userMoney) {
    this.userMoney = userMoney;
  }
}
