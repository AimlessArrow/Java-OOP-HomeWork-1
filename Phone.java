public class Phone
{
  // ����� ��������
  private String phone_number;
  // ������ �� ��������� ���� ����� �����������
  private Network phone_network;
  
  public Phone()
  {
    
  }
  
  public Phone(String new_phone_number)
  {
    if(new_phone_number.isEmpty() || new_phone_number == null)
    {
      throw new IllegalArgumentException("������ ������� �����������! (������ ������ ���� Null ��������)");
    }
    else
    {
      this.phone_number = new_phone_number;
    }
  }
  
  public String get_phone_number()
  {
    return this.phone_number;
  }
  
  public void set_phone_number(String new_phone_number)
  {
    if(new_phone_number.isEmpty() || new_phone_number == null)
    {
      System.out.println("������� ������������ ������ (������ ������)");
    }
    else
    {
      this.phone_number = new_phone_number;
    }
  }
  
  public void register_phone(Network phone_operator)
  {
    phone_operator.add_phone_number(this.phone_number);
    this.phone_network = phone_operator;
  }
  
  public void call(String target_phone_number)
  {
    if(target_phone_number.isEmpty() || target_phone_number == null)
    {
      System.out.println("������� ������������ ������ (������ ������)");
    }
    else if(this.phone_network.search_phone_number(target_phone_number))
    {
      System.out.println("������ �������� �������");
    }
    else
    {
      System.out.println("����� �������� �� ������ � ���� ���������");
    }
  }
}