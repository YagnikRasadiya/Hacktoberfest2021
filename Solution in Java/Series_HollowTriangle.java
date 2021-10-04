import java.util.*;
public class hollowTriangle
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number N ");
        int N = in.nextInt();
        int i, j,k,s=1;
        for(i=1;i<=N;i++)
        {
            for(k=1;k<=N-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=s;j++)
            {
                if(j==1 || j==s || i==N)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            s=s+2;
            System.out.println();
        }
    }
}
