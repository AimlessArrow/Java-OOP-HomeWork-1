public class Triangle 
{
  private int a;
  private int b;
  private int c;
  
  public Triangle() {}
  
  public Triangle(int newA, int newB, int newC) {
    if(newA < 1 || newB < 1 || newC < 1) {
      throw new IllegalArgumentException("Incorrect input");
    } else {
      this.a = newA;
      this.b = newB;
      this.c = newC;
    }
  }
  
  public void setA(int newA) {
    if(newA < 1) {
      System.out.println("Incorrect input");
    } else {
      this.a = newA;
    }
  }
  
  public void setB(int newB) {
    if(newB < 1) {
      System.out.println("Incorrect input");
    } else {
      this.b = newB;
    }
  }
  
  public void setC(int newC) {
    if(newC < 1) {
      System.out.println("Incorrect input");
    } else {
      this.c = newC;
    }
  }
  
  public int getA() {
    return this.a;
  }
  
  public int getB() {
    return this.b;
  }
  
  public int getC() {
    return this.c;
  }
  
  public double calcArea() {
    if(this.a < 1 || this.b < 1 || this.c < 1) {
      System.out.println("Incorrect input");
      return 0;
    } else {
      double p = (this.a + this.b +this.c)/2;
      double area = Math.sqrt(p*(p - this.a)*(p - this.b)*(p - this.c));
      return area;
    }
  }
  
  public double calcArea(int newA, int newB, int newC) {
    if(newA < 1 || newB < 1 || newC < 1) {
      System.out.println("Incorrect input");
      return 0;
    } else {
      this.a = newA;
      this.b = newB;
      this.c = newC;
      double p = (this.a + this.b +this.c)/2;
      double area = Math.sqrt(p*(p - this.a)*(p - this.b)*(p - this.c));
      return area;
    }
  }
  
  @Override
  public String toString() {
    return "Triangle [a=" + this.a + ", b=" + this.b + 
      ", c=" + this.c + "]";
  }
}