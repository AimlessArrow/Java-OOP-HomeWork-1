/*
 * 1) Создание класcа Cat
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
    
    // Стандартный конструктор
    public Cat()
    {
      this.breed = "Безпородная";
      this.age = 0;
      this.hair_colour = "Чёрный";
      this.mood = "Спокойное";
      this.name = "Барсик";
    }
 
    // Перегруженный конcтруктор
    public Cat(String new_breed, String new_hair_colour, int new_age, String new_mood, String new_name)
    {
        // Обрабатываем пользовательский ввод
        // в случае некорректного ввода возвращаем исключение с текстом ошибки.
        // Порода устанавливается в конструкторе т.к. порода не меняется в течении жизни кошки  
      if(new_breed.isEmpty() || new_breed == null 
             || new_hair_colour.isEmpty() || new_hair_colour == null
             || new_age < 0
             || new_mood.isEmpty() || new_mood == null
             || new_name.isEmpty() || new_name == null)
        {
            throw new IllegalArgumentException("Данные введены некорректно! (Пустая строка либо Null значение)");
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
        // При обработке сеттеров проверяем ввод и при некорректном 
        // значении выводим предупреждение
        if(new_breed.isEmpty() || new_breed == null)
        {
          System.out.println("Данные введены некорректно! (Пустая строка либо Null значение)");
        }
        else
        {
          this.breed = new_breed;
        }
    }
    
    public void set_mood(String new_mood)
    {
        // При обработке сеттеров проверяем ввод и при некорректном 
        // значении выводим предупреждение
        if(new_mood.isEmpty() || new_mood == null)
        {
          System.out.println("Данные введены некорректно! (Пустая строка либо Null значение)");
        }
        else
        {
          this.mood = new_mood;
        }
    }
    
    public void set_hair_colour(String new_hair_colour)
    {
        // При обработке сеттеров проверяем ввод и при некорректном 
        // значении выводим предупреждение
        if(new_hair_colour.isEmpty() || new_hair_colour == null)
        {
          System.out.println("Данные введены некорректно! (Пустая строка либо Null значение)");
        }
        else
        {
          this.mood = new_hair_colour;
        }
    }
 
    public void set_age(int new_age)
    {
        // При обработке сеттеров проверяем ввод и при некорректном 
        // значении выводим предупреждение
        if(new_age < 0)
        {
          System.out.println("Данные введены некорректно! (Меньше нуля)");
        }
        else
        {
          this.age = new_age;
        }
    }
 
    public void set_name(String new_name)
    {
        // При обработке сеттеров проверяем ввод и при некорректном 
        // значении выводим предупреждение
        if(new_name.isEmpty() || new_name == null)
        {
          System.out.println("Данные введены некорректно! (Пустая строка либо Null значение)");
        }
        else
        {
          this.name = new_name;
        }
    }
 
    // Геттеры для свойств класса
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
      this.set_mood("Игривое");
    }
    
    @Override
    public String toString()
    {
      return "Cat [name=" + this.name + ", breed=" + this.breed + 
        ", hair_colour=" + this.hair_colour + ", age=" + this.age + ", mood=" +
        this.mood + "]";
    }
}
