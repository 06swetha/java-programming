import java.io.*;
import java.util.*;
class chartriangle
{
public static void main(String arg[])
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.print("Enter character :");
char k=s.next().charAt(0);
System.out.print("Enter number of rows :");
int r=s.nextInt();
for(i=1;i<=r;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(k+" ");

}
System.out.println();
}
}
}