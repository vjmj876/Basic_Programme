package comDemo1;

public class Equaltest {
public static void main(String[] args) {
String str1= new String("ABCD");
String str2= new String("ABCD");
if(str1 == str2)
{
System.out.println("String 1 == String 2 is true");
}
else
{
System.out.println("String 1 == String 2 is false");
String str3 = str2;
if( str2 == str3)
{
System.out.println("String 2 == String 3 is true");
}
else
{
System.out.println("String 2 == String 3 is false");
}
if(str1.equals(str2))
{
System.out.println("String 1 equals string 2 is true");
}
else
{
System.out.println("String 1 equals string 2 is false");
}
}
}
}
