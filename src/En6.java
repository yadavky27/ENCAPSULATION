class constructure
{
    private String name;
    private String city;
public constructure(String name,int age,String city)
    {
       this. city=city;
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    private int age;

    public String getName() {
        return name;
    }
}
public class En6 {
    public static void main(String[] args) {
constructure co=new constructure("krishna",24,"mankapure");
        System.out.println(co.getAge());
        System.out.println(co.getCity());
        System.out.println(co.getName());
    }
}
