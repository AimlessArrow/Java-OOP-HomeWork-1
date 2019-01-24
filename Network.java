import java.util.*;

public class Network {
  private String operatorName;
  private ArrayList<String> phoneBase;
  
  public Network() {
    phoneBase = new ArrayList<String>();
  }
  
  public Network(String newOperatorName) {
    phoneBase = new ArrayList<String>();
    if(newOperatorName.isEmpty() || newOperatorName == null) {
      throw new IllegalArgumentException("Incorrect input");
    } else {
      this.operatorName = newOperatorName;
    }
  }
  
  public String getOperatorName() {
    return this.operatorName;
  }
  
  public void setOperator(String newOperatorName) {
    if(newOperatorName.isEmpty() || newOperatorName == null) {
      System.out.println("Incorrect input");
    } else {
      this.operatorName = newOperatorName;
    }
  }
  
  public void getPhoneNetwork() {
    for(int i=0; i<this.phoneBase.size(); i++) {
      System.out.print((this.phoneBase.get(i)).toString());
    }
  }
  
  public void addPhoneNumber(String phoneNumber) {
    if(phoneNumber.isEmpty() || phoneNumber == null) {
      System.out.println("Incorrect input");
    } else if(this.phoneBase == null) {
      this.phoneBase.add(phoneNumber);
    } else if(this.phoneBase.contains(phoneNumber)) {
      System.out.println("The number is already in the base");
    } else {
      this.phoneBase.add(phoneNumber);
    }
  }
  
  public void removePhoneNumber(String phoneNumber) {
    if(phoneNumber.isEmpty() || phoneNumber == null) {
      System.out.println("Incorrect input");
    } else if(!this.phoneBase.contains(phoneNumber)) {
      System.out.println("The number is not found");
    } else {
      int phoneIndex = this.phoneBase.indexOf(phoneNumber);
      this.phoneBase.remove(phoneIndex);
    }
  }
  
  public boolean searchPhoneNumber(String targetPhoneNumber) {
    if(targetPhoneNumber.isEmpty() || targetPhoneNumber == null) {
      System.out.println("Incorrect input");
      return false;
    } else if(this.phoneBase.contains(targetPhoneNumber)) {
      return true;
    } else {
      return false;
    }
  }
}
