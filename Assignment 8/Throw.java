public class program6
{
static void calculate()
{
throw new ArithmeticException();
}
public static void main(String args[])
{
 
try
{
calculate();
}
 
 
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thank You");
}
}
