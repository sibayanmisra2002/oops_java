import org.w3c.dom.ranges.RangeException; class program10
{
public static void main(String args[])
{

int sum=0; try
{
if(args.length!=7)
throw new CheckArguments("Invalid number of inputs");
 
try
{
for (int i = 1; i < 7; i++) {
if (Integer.parseInt(args[i]) >= 0 && Integer.parseInt(args[i]) <= 50) sum += Integer.parseInt(args[i]);
else
throw new RangeException((short) 0, "Range of marks must be between 0 to 50");
 
}
 
System.out.println("Total marks of "+args[0]+" is : " + sum); System.out.println("Total Percentage of "+args[0]+" is : " + sum/6.0*2);
}
catch(RangeException e)
{
System.out.println(e);
}
catch(Exception e)
{
throw new CheckArguments("Invalid type of input");
}
}
catch (CheckArguments e)
{
System.out.println(e);
}
}
}
