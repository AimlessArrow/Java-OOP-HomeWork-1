public class Phone {
  private String phoneNumber;
  private Network phoneNetwork;
  
  public Phone() {}
  
  public Phone(String newPhoneNumber) {
    if(newPhoneNumber.isEmpty() || newPhoneNumber == null) {
      throw new IllegalArgumentException("Incorrect input");
    } else {
      this.phoneNumber = newPhoneNumber;
    }
  }
  
  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String newPhoneNumber) {
    if(newPhoneNumber.isEmpty() || newPhoneNumber == null) {
      System.out.println("Incorrect input");
    } else {
      this.phoneNumber = newPhoneNumber;
    }
  }
  
  public void registerPhone(Network phoneOperator) {
    phoneOperator.addPhoneNumber(this.phoneNumber);
    this.phoneNetwork = phoneOperator;
  }
  
  public void call(String targetPhoneNumber) {
    if(targetPhoneNumber.isEmpty() || targetPhoneNumber == null) {
      System.out.println("Incorrect input");
    } else if(this.phoneNetwork.searchPhoneNumber(targetPhoneNumber)) {
      System.out.println("Call successfull");
    } else {
      System.out.println("The number is not found");
    }
  }
}
