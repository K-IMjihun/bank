package dto;

public class FindUserDTO {

  private String name;
  private String RRN;

  public FindUserDTO(String name, String RRN) {
    this.name = name;
    this.RRN = RRN;
  }

  public String getName() {
    return name;
  }

  public String getRRN() {
    return RRN;
  }
}
