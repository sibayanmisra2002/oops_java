import java.util.*;         
class program6
{
String decimalToBinary(int n)
{
String s="";         
do
{
s=Integer.toString(n%2)+s;         
n/=2;        
}while(n>0);         
return(s);        
}
int binaryToDecimal(int n)
{
int x=0,c=0;         
do
{
x+=n%10*Math.pow(2,c++);         
n/=10;        
}
while(n>0);         
return(x);        
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);         
program6 ob = new program6();         
System.out.print("Enter a number: ");        
System.out.println("Binary representation: "+ob.decimalToBinary(in.nextInt()));         
System.out.print("Enter a binary number: ");        
System.out.println("Decimal representation: "+ob.binaryToDecimal(in.nextInt()));        
}
}
