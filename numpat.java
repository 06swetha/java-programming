import java.util.*;
class numpat
 {
  public static void main(String args[])
 {
    int n = 4;
    for (int i = 1; i <= n; i++) 
{
      for (int j = 1; j <= i; j++) 
{
        System.out.print(i + " ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--)
 {
      for (int j = 1; j <= i; j++) 
{
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
