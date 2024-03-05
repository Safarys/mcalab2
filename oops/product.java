import java.util.Scanner;
class comp
{
    Scanner s=new Scanner(System.in);
    int p1;
    String n1;
    int c1;
    void insert()
    {
        System.out.println("Enter Product code");
        c1=s.nextInt();
        s.nextLine();
        System.out.println("Enter Product name");
        n1=s.nextLine();
        System.out.println("Enter Product Price");
        p1=s.nextInt();

    }
    int getprice()
    {
        return p1;
    }

    void display()
    {
        System.out.println("\n Product details ");
        System.out.println("\n code: "+c1);
        System.out.println("\n name: "+n1);
        System.out.println("\n Price: "+p1);
    }
}

class product
{
public static void main(String args[])
{
    comp c1=new comp();
    comp c2=new comp();
    comp c3=new comp();
    c1.insert();
    c2.insert();
    c3.insert();
    int pr=c1.getprice();
    int po=c2.getprice();
    int pd=c3.getprice();

    if(pr<po && pr<pd)
    {
        c1.display();
    }
    else if(po<pd)
    {
        c2.display();
    }
    else{
        c3.display();
    }
}
}