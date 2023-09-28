class stud
{
    private String name;
    private String city;
    private int age;

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age)
    {
        this.age=age;
    }
    int getage()
    {
        return age;
    }
    void setName(String name)
    {
       this. name=name;
    }

    public String getName() {
        return name;
    }

    String getname()
    {
        return name;
    }
    void setCity(String city)
    {
        this.city=city;
    }
    String  getcity()
    {
        return city;
    }
}
public class En4 {
    public static void main(String[] args) {
stud st=new stud();
st.setAge(24);
st.setCity("nagpur");
st.setName("krishna");
        stud st1=new stud();
st1.setCity("jharkhand");
        System.out.println(st1.getCity());
        System.out.println(st.getage());
        System.out.println(st.getname());
        System.out.println(st.getcity());
    }
}
//(this.) keyword is resolve the shadowing problem