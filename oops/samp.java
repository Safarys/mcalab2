import java.util.Scanner;
class samp{
public static void main(String arg[])
{

Scanner s=new Scanner(System.in);
System.out.println("next() & nextLine() is used for input ");
String name=s.nextLine();
String n=s.next();
System.out.println("nextInt() is used for integer ");
int t=s.nextInt();
System.out.println("nextFloat() is used for floating point values ");
float p=s.nextFloat();
System.out.println("First word is"+n);
System.out.println("First sentenance  is"+name);
System.out.println("Integer value is "+t);
System.out.println("Floating point is "+p);


}
}