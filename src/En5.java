class dog
{
    private int cost;
    private String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
public class En5 {
    public static void main(String[] args) {
        dog d=new dog();
        d.setCost(2400);
        d.setDog("sheru");
        System.out.println(d.getCost());
        System.out.println(d.getDog());
    }
}
