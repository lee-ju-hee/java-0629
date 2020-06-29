class Man
{
    private String name;

    Man(String name)
    {
        this.name = name;
    }

    Man()
    {
        this.name = "kim";
    }
    void tellYourName()
    {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man
{
    private String company;
    private String position;

    BusinessMan(String name, String company, String position)
    {
        //super(name);
        this.company = company;
        this.position = position;
    }
    void tellYourInfo()
    {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
    }
}
public class ljh062901{
    public static void main(String[] args){

        BusinessMan m1 = new BusinessMan("Hong", "3D LED", "Staff");
        BusinessMan m2 = new BusinessMan("Le", "3D LED", "Assist");

        System.out.println("First man info");
        m1.tellYourName();
        m1.tellYourInfo();

        System.out.println("Second man info");
        m2.tellYourInfo();
        m2.tellYourName();
    }
}