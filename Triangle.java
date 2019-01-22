public class Triangle 
{
  private int a;
  private int b;
  private int c;
  
  public Triangle()
  {
    
  }
  
  public Triangle(int new_a, int new_b, int new_c)
  {
    if(new_a < 1 || new_b < 1 || new_c < 1)
    {
      throw new IllegalArgumentException("Данные введены некорректно! (Значение меньше единицы)");
    }
    else
    {
      this.a = new_a;
      this.b = new_b;
      this.c = new_c;
    }
  }
  
  public void set_a(int new_a)
  {
    if(new_a < 1)
    {
      System.out.println("Данные введены некорректно! (Значение меньше единицы)");
    }
    else
    {
      this.a = new_a;
    }
  }
  
  public void set_b(int new_b)
  {
    if(new_b < 1)
    {
      System.out.println("Данные введены некорректно! (Значение меньше единицы)");
    }
    else
    {
      this.b = new_b;
    }
  }
  
  public void set_c(int new_c)
  {
    if(new_c < 1)
    {
      System.out.println("Данные введены некорректно! (Значение меньше единицы)");
    }
    else
    {
      this.c = new_c;
    }
  }
  
  public int get_a()
  {
    return this.a;
  }
  
  public int get_b()
  {
    return this.b;
  }
  
  public int get_c()
  {
    return this.c;
  }
  
  public double calc_area()
  {
    if(this.a < 1 || this.b < 1 || this.c < 1)
    {
      System.out.println("Данные заданы некорректно! (Значение меньше единицы)");
      return 0;
    }
    else
    {
      // По формуле Герона
      // Полупериметр p
      double p = (this.a + this.b +this.c)/2;
      // Площадь S
      double s = Math.sqrt(p*(p - this.a)*(p - this.b)*(p - this.c));
      return s;
    }
  }
  
  // Перегружаем функцию
  public double calc_area(int new_a, int new_b, int new_c)
  {
    if(new_a < 1 || new_b < 1 || new_c < 1)
    {
      System.out.println("Данные введены некорректно! (Значение меньше единицы)");
      return 0;
    }
    else
    {
      // Обновляем значения свойств класса
      this.a = new_a;
      this.b = new_b;
      this.c = new_c;
      // По формуле Герона
      // Полупериметр p
      double p = (this.a + this.b +this.c)/2;
      // Площадь S
      double s = Math.sqrt(p*(p - this.a)*(p - this.b)*(p - this.c));
      return s;
    }
  }
  
  @Override
  public String toString()
  {
    return "Triangle [a=" + this.a + ", b=" + this.b + 
      ", c=" + this.c + "]";
  }
}