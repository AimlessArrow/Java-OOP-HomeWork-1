public class MyClass 
{
  public static void main(String args[]) 
  {
    // Класс Cat
    Cat my_cat = new Cat();
    my_cat.set_breed("Сиамская");
    my_cat.set_hair_colour("Серый");
    my_cat.set_mood("Игривое");
    my_cat.set_age(5);
    my_cat.set_name("Собака");
    System.out.println(my_cat);
    
    Cat my_cheshire_cat = new Cat("Чеширская", "Серый", 5, "Спокойное", "Кот Котский");
    System.out.println(my_cheshire_cat);
    
    // Класс Triangle
    Triangle my_triangle = new Triangle(2,2,2);
    System.out.println(my_triangle);
    System.out.println("Площадь треугольника: " + my_triangle.calc_area());
    
    // Класс Vector3D
    Vector3D my_vector = new Vector3D(1,2,3);
    Vector3D my_another_vector = new Vector3D(3,2,1);
    Vector3D result_vector = new Vector3D(0,0,0);
    result_vector = my_vector.add_vector(my_another_vector);
    System.out.println(result_vector);
    result_vector = my_vector.calc_scalar_product(my_another_vector);
    System.out.println(result_vector);
    result_vector = my_vector.calc_vector_product(my_another_vector);
    System.out.println(result_vector);
    
    // Класс Phone и Network
    Phone my_phone = new Phone("+77771231234");
    Phone target_phone = new Phone("+77773211234");
    Network tele2 = new Network("Tele2");
    my_phone.register_phone(tele2);
    my_phone.call(target_phone.get_phone_number());
    target_phone.register_phone(tele2);
    my_phone.call(target_phone.get_phone_number());
  }
}
