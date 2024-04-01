import java.util.Scanner;
class matrixaddition
{
    //input
    int[][] inputmatrix(int r1,int c1)
    {
        Scanner s1=new Scanner(System.in);
        
        int[][] m1=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                m1[i][j]=s1.nextInt();
            }
        }
        return m1;
    }
    //find sum

    int[][] sum(int[][] a,int[][] b,int r,int c)
    {
        int[][] matrixsum=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrixsum[i][j]=a[i][j]+b[i][j];
            }
        }
        return matrixsum;
    }

    //output

    int[][] display(int[][] a,int r,int c)
    {
        int[][] display=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        return display;
    }

}

class matrix
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        matrixaddition m=new matrixaddition();
        int[][] a=new int[10][10];
        int[][] b=new int[10][10];
        int[][] result=new int[10][10];

        System.out.println("Enter no. of rows ");
        int r=s.nextInt();

        System.out.println("Enter no. of columns ");
        int c=s.nextInt();

        System.out.println("Enter Matrix 1 ");
        a=m.inputmatrix(r,c);

        System.out.println("Enter Matrix 2 ");
        b=m.inputmatrix(r,c);

        result=m.sum(a,b,r,c);

        System.out.println("Matrix 1 ");
        m.display(a,r,c);

        System.out.println("Matrix 2 ");
        m.display(b,r,c);

        System.out.println("Sum");
        m.display(result,r,c);
    }
}