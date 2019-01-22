public class Vector3D
{
  private int x;
  private int y;
  private int z;
  
  public Vector3D()
  {
    
  }
  
  public Vector3D(int new_x, int new_y, int new_z)
  {
    if(new_x < 0 || new_y < 0 || new_z < 0)
    {
      throw new IllegalArgumentException("Данные введены некорректно! (Значение меньше нуля)");
    }
    else
    {
      this.x = new_x;
      this.y = new_y;
      this.z = new_z;
    }
  }
  
  public void set_x(int new_x)
  {
    this.x = new_x;
  }
  
  public void set_y(int new_y)
  {
      this.y = new_y;
  }
  
  public void set_z(int new_z)
  {
    this.z = new_z;
  }
  
  public int get_x()
  {
    return this.x;
  }
  
  public int get_y()
  {
    return this.y;
  }
  
  public int get_z()
  {
    return this.z;
  }
  
  public Vector3D add_vector(Vector3D another_vector)
  {
    Vector3D result = new Vector3D();
    
    result.x = this.x + another_vector.x;
    result.y = this.y + another_vector.y;
    result.z = this.z + another_vector.z;
    
    return result;
  }
  
  public Vector3D calc_scalar_product(Vector3D another_vector)
  {
    Vector3D result = new Vector3D();
    
    result.x = this.x * another_vector.x;
    result.y = this.y * another_vector.y;
    result.z = this.z * another_vector.z;
    
    return result;
  }
  
  public Vector3D calc_vector_product(Vector3D another_vector)
  {
    Vector3D result = new Vector3D();
    
    result.x = this.y * another_vector.z - this.z * another_vector.y;
    result.y = this.x * another_vector.z - this.z * another_vector.x;
    result.z = this.x * another_vector.y - this.y * another_vector.x;
    
    return result;
  }
  
  @Override
  public String toString()
  {
    return "Vector3D [x=" + this.x + ", y=" + this.y + 
      ", z=" + this.z + "]";
  }
}