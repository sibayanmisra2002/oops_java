class CheckArguments extends Exception
{
CheckArguments(String message)
{super(message);}
}
class program9
{
public static void main(String args[])
{

int sum=0; try
{
if(args.length!=5)
throw new CheckArguments("Invalid number of inputs");
 
try
{
for(int i=0;i<args.length;i++)
sum += Integer.parseInt(args[i]); 
System.out.println("Sum=" + sum);
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
