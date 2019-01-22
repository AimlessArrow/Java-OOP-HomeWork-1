/*
 * 1) �������� ����c� Cat
 *
 */
public class Cat
{
    // Name
    private String name;
    // Breed
    private String breed;
    // Hair colour
    private String hair_colour;
    // Age
    private int age;
    // Mood
    private String mood;
    
    // ����������� �����������
    public Cat()
    {
      this.breed = "�����������";
      this.age = 0;
      this.hair_colour = "׸����";
      this.mood = "���������";
      this.name = "������";
    }
 
    // ������������� ���c�������
    public Cat(String new_breed, String new_hair_colour, int new_age, String new_mood, String new_name)
    {
        // ������������ ���������������� ����
        // � ������ ������������� ����� ���������� ���������� � ������� ������.
        // ������ ��������������� � ������������ �.�. ������ �� �������� � ������� ����� �����  
      if(new_breed.isEmpty() || new_breed == null 
             || new_hair_colour.isEmpty() || new_hair_colour == null
             || new_age < 0
             || new_mood.isEmpty() || new_mood == null
             || new_name.isEmpty() || new_name == null)
        {
            throw new IllegalArgumentException("������ ������� �����������! (������ ������ ���� Null ��������)");
        }
        else
        {
            this.breed = new_breed;
            this.hair_colour = new_hair_colour;
            this.age = new_age;
            this.mood = new_mood;
            this.name = new_name;
        }
    }
    
    public void set_breed(String new_breed)
    {
        // ��� ��������� �������� ��������� ���� � ��� ������������ 
        // �������� ������� ��������������
        if(new_breed.isEmpty() || new_breed == null)
        {
          System.out.println("������ ������� �����������! (������ ������ ���� Null ��������)");
        }
        else
        {
          this.breed = new_breed;
        }
    }
    
    public void set_mood(String new_mood)
    {
        // ��� ��������� �������� ��������� ���� � ��� ������������ 
        // �������� ������� ��������������
        if(new_mood.isEmpty() || new_mood == null)
        {
          System.out.println("������ ������� �����������! (������ ������ ���� Null ��������)");
        }
        else
        {
          this.mood = new_mood;
        }
    }
    
    public void set_hair_colour(String new_hair_colour)
    {
        // ��� ��������� �������� ��������� ���� � ��� ������������ 
        // �������� ������� ��������������
        if(new_hair_colour.isEmpty() || new_hair_colour == null)
        {
          System.out.println("������ ������� �����������! (������ ������ ���� Null ��������)");
        }
        else
        {
          this.mood = new_hair_colour;
        }
    }
 
    public void set_age(int new_age)
    {
        // ��� ��������� �������� ��������� ���� � ��� ������������ 
        // �������� ������� ��������������
        if(new_age < 0)
        {
          System.out.println("������ ������� �����������! (������ ����)");
        }
        else
        {
          this.age = new_age;
        }
    }
 
    public void set_name(String new_name)
    {
        // ��� ��������� �������� ��������� ���� � ��� ������������ 
        // �������� ������� ��������������
        if(new_name.isEmpty() || new_name == null)
        {
          System.out.println("������ ������� �����������! (������ ������ ���� Null ��������)");
        }
        else
        {
          this.name = new_name;
        }
    }
 
    // ������� ��� ������� ������
    public String get_breed()
    {
      return this.breed;
    }
    
    public String get_hair_colour()
    {
      return this.hair_colour;
    }
    
    public int get_age()
    {
      return this.age;
    }
    
    public String get_mood()
    {
      return this.mood;
    }
    
    public String get_name()
    {
      return this.name;
    }
    
    public void purr()
    {
      System.out.println("Purrrrrrrr...");
    }
    
    public void play()
    {
      this.set_mood("�������");
    }
    
    @Override
    public String toString()
    {
      return "Cat [name=" + this.name + ", breed=" + this.breed + 
        ", hair_colour=" + this.hair_colour + ", age=" + this.age + ", mood=" +
        this.mood + "]";
    }
}
