class krishna
{
    private int age;
    private String city;
    private String name;
    void setCity(String a)
    {
        city =a;
    }
    String getcity()
    {
        return city;
    }
   void setName(String b)
   {
      name =b;
   }
   String getName()
   {
       return name;
   }
    void setAge(int c)
    {
        age =c;
    }
    int getAge()
    {
        return age;
    }
}
public class En3 {
    public static void main(String[] args) {
krishna kr=new krishna();
kr.setCity("nagpur");
String city=kr.getcity();
        System.out.println("city = "+city);
        kr.setName("krishna");
        String name=kr.getName();
        System.out.println("Name = "+name);
        kr.setAge(24);
        int age=kr.getAge();
        System.out.println("Age = "+age);
    }
}
