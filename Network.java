import java.util.*;

public class Network
{
  // �������� �������� ���������
  private String operator_name;
  // ���� ���������� �������(Thread-safe)
  private Vector<String> phone_base;
  
  // ������������
  public Network()
  {
    // ��������������� ������
    phone_base = new Vector<String>();
  }
  
  public Network(String new_operator_name)
  {
    // ��������������� ������
    phone_base = new Vector<String>();
    // ���������� ������� ������
    if(new_operator_name.isEmpty() || new_operator_name == null)
    {
      throw new IllegalArgumentException("������ ������� �����������! (������ ������ ���� Null ��������)");
    }
    else
    {
      this.operator_name = new_operator_name;
    }    
  }
  
  // ������� � �������
  public String get_operator_name()
  {
    return this.operator_name;
  }
  
  public void set_operator(String new_operator_name)
  {
    // ���������� ������� ������
    if(new_operator_name.isEmpty() || new_operator_name == null)
    {
      System.out.println("������ ������� �����������");
    }
    else
    {
      this.operator_name = new_operator_name;
    }
  }
  
  public void get_phone_network()
  {
    for(int i=0;i<this.phone_base.size();i++)
    {
      System.out.print((this.phone_base.get(i)).toString());
    }
  }
  
  // ���������� ������ � ����
  public void add_phone_number(String phone_number)
  {
    if(phone_number.isEmpty() || phone_number == null)
    {
      System.out.println("������ ������� �����������");
    }
    else if(this.phone_base == null)
    {
      this.phone_base.add(phone_number);
    }
    else if(this.phone_base.contains(phone_number))
    {
      System.out.println("����� �������� ��� � ����");
    }
    else
    {
      this.phone_base.add(phone_number);
    }
  }
  
  // �������� ������ �� ����
  public void remove_phone_number(String phone_number)
  {
    if(phone_number.isEmpty() || phone_number == null)
    {
      System.out.println("������ ������� �����������");
    }
    else if(!this.phone_base.contains(phone_number))
    {
      System.out.println("����� �������� �� ������ � ����");
    }
    else
    {
      int phone_index = this.phone_base.indexOf(phone_number);
      this.phone_base.remove(phone_index);
    }
  }
  
  public boolean search_phone_number(String target_phone_number)
  {
    if(target_phone_number.isEmpty() || target_phone_number == null)
    {
      System.out.println("������ ������� �����������");
      return false;
    }
    else if(this.phone_base.contains(target_phone_number))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
