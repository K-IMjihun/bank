package dto;

public class LoginDTO {

  private String ID;
  private String PW;

  public LoginDTO(String ID, String PW) {
    this.ID = ID;
    this.PW = PW;
  }

  public String getID() {
    return ID;
  }

  public String getPW() {
    return PW;
  }
}
