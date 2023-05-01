public class program8_1
{
static void calculate()
{
System.out.println("Calculate called");
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
finally
 
{
System.out.println("Finally Block");
}
System.out.println("Thank You");

}
}
