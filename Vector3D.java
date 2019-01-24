public class Vector3D {
  private int x;
  private int y;
  private int z;
  
  public Vector3D() {}
  
  public Vector3D(int newX, int newY, int newZ) {
    if(newX < 0 || newY < 0 || newZ < 0) {
      throw new IllegalArgumentException("Incorrect input");
    } else {
      this.x = newX;
      this.y = newY;
      this.z = newZ;
    }
  }
  
  public void setX(int newX) {
    this.x = newX;
  }
  
  public void setY(int newY) {
      this.y = newY;
  }
  
  public void setZ(int newZ) {
    this.z = newZ;
  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }
  
  public int getZ() {
    return this.z;
  }
  
  public Vector3D addVector(Vector3D anotherVector) {
    Vector3D result = new Vector3D();
    
    result.x = this.x + anotherVector.x;
    result.y = this.y + anotherVector.y;
    result.z = this.z + anotherVector.z;
    
    return result;
  }
  
  public double calcScalarProduct(Vector3D anotherVector) {
    double result;
    
    result = this.x * anotherVector.x + this.y * anotherVector.y + this.z * anotherVector.z;
    return result;
  }
  
  public Vector3D calcVectorProduct(Vector3D anotherVector) {
    Vector3D result = new Vector3D();
    
    result.x = this.y * anotherVector.z - this.z * anotherVector.y;
    result.y = this.x * anotherVector.z - this.z * anotherVector.x;
    result.z = this.x * anotherVector.y - this.y * anotherVector.x;
    
    return result;
  }
  
  @Override
  public String toString() {
    return "Vector3D [x=" + this.x + ", y=" + this.y + 
      ", z=" + this.z + "]";
  }
}