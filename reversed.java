import java.io.*;
import java.util.*;
public class reversed
{
public static void main(String arg[])
{
String str="TEMPLE",nstr="";
char ch;
System.out.println("original word");
System.out.println("TEMPLE");
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
nstr=ch+nstr;
}
System.out.println("reversed string is " +nstr);
}
}