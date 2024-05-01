import java.util.Scanner;
class person
{
    String name,gender,address;
    int age;
    //person()
    person(String name,String gender,int age,String address)
    {
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age; 
    }
}
class employee extends person
{
    int emp_id;
    String company_name,qualification;
    double salary;
    //employee()
    employee(String name,String gender,int age,String address,int emp_id,String company_name,String qualification,double salary)
    {
        super(name, gender, age, address);
        this.emp_id=emp_id;
        this.company_name=company_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class teacher extends employee
{
    String subject,dept;
    int teacher_id;
    //teacher()
    teacher(String name,String gender,int age,String address,int emp_id,String company_name,String qualification,double salary,String subject,String dept,int teacher_id)
    {
        super(name, gender, age, address, emp_id, company_name, qualification, salary);
        this.subject=subject;
        this.dept=dept;
        this.teacher_id=teacher_id; 
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Address :" +address);
        
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Company Name :"+company_name);
        System.out.println("Qualification :"+qualification);
        System.out.println("Salary :"+salary);
        System.out.println("Teacher ID :"+teacher_id);
        System.out.println("Subject :" +subject);
        System.out.println("Department :" +dept);
    }
}
class details
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n Teachers");
        int n=s.nextInt();
        s.nextLine();
        teacher[] t=new teacher[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name of teacher :") ;
            String name=s.nextLine();
            System.out.println("Enter  Gender (M/F) : ");
            String gender =s.nextLine();
            System.out.println("Enter  age :");
            int age=s.nextInt();
            s.nextLine();
            System.out.println("Enter Address :");
            String address=s.nextLine();
            System.out.println("Enter Employee id :");
            int emp_id=s.nextInt();
            s.nextLine();
            System.out.println("Enter Company Name :");
            String company_name=s.nextLine();
            System.out.println("Enter Qualification :");
            String qualification=s.nextLine();
            System.out.println("Enter Salary :");
            double salary=s.nextDouble();
            System.out.println("Enter Teacher ID :");
            int teacher_id=s.nextInt();
            s.nextLine();
            System.out.println("Enter subject :");
            String subject=s.nextLine();
            System.out.println("Enter Department :");
            String dept=s.nextLine();
            t[i]=new teacher(name, gender, age, address, emp_id, company_name, qualification, salary, subject, dept, teacher_id);
        }
        
        //To display n teachers
        for(i=0;i<n;i++)
        {
            t[i].display();
            System.out.println(" -------------------------");
        }


    }
}