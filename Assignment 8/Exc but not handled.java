public class program3
{
static void calculate()
{
int a=1/0; System.out.println(a);
}
public static void main(String args[])
{
 
try
{
calculate();
}
 



 
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index not valid");
}
System.out.println("Thank You");
}
}
