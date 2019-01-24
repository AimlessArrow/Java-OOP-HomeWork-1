public class MyClass {
  public static void main(String args[]) {
    /* Класс Cat */
    Cat myCat = new Cat();
    myCat.setBreed("Aegean");
    myCat.setHairColour("White and grey");
    myCat.setMood("Irritated");
    myCat.setAge(5);
    myCat.setName("Tom");
    System.out.println(myCat);
    
    Cat myCheshireCat = new Cat("Munchkin", "White", 5, "Calm", "Snowflake");
    System.out.println(myCheshireCat);
    
    /* Класс Triangle */
    Triangle myTriangle = new Triangle(2, 2, 2);
    System.out.println(myTriangle);
    System.out.println("Triangle area: " + myTriangle.calcArea());
    
    /* Класс Vector3D */
    Vector3D myVector = new Vector3D(1, 2, 3);
    Vector3D myAnotherVector = new Vector3D(3, 2, 1);
    Vector3D resultVector = new Vector3D(0, 0, 0);
    double scalarProduct = myVector.calcScalarProduct(myAnotherVector);
    System.out.println(scalarProduct);
    resultVector = myVector.addVector(myAnotherVector);
    System.out.println(resultVector);
    resultVector = myVector.calcVectorProduct(myAnotherVector);
    System.out.println(resultVector);
    
    /* Класс Phone и Network */
    Phone myPhone = new Phone("+77771231234");
    Phone targetPhone = new Phone("+77773211234");
    Network tele2 = new Network("Tele2");
    myPhone.registerPhone(tele2);
    myPhone.call(targetPhone.getPhoneNumber());
    targetPhone.registerPhone(tele2);
    myPhone.call(targetPhone.getPhoneNumber());
  }
}
