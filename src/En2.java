class studen
{
    private int age;
    private String city;
    private String name;
    void setAge(int a)
    {
        age=a;
        System.out.println(a);
    }
    void setName(String  b)
    {
        System.out.println(b);

    }
    void setCity(String  c)
    {
        System.out.println(c);
    }
}
public class En2 {
    public static void main(String[] args) {
        studen st=new studen();
       // st.age=24;  this is not valid bcz the private keyword is not directly access
      //  st.age(24);   this is not valid bcz the private keyword is not directly access
st.setAge(24);
st.setName("krishna");
        st.setCity("nagpur");
    }
}
