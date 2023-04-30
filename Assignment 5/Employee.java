import java.util.*; 
class Employee {
int emp_id; 
String emp_name;
double basic_salary; void display() {
double da=basic_salary*15/100; 
double hra=basic_salary*10/100; 
double gross_sal=basic_salary+da+hra;
System.out.println ("Employee Id= "+emp_id); 
System.out.println ("Employee Name= "+emp_name); 
System.out.println ("Gross Salary= "+gross_sal);
}
}

class program11
{
public static void main(String[] args){

Scanner in = new Scanner(System.in); 
Employee ob = new Employee(); 
System.out.println ("Enter Employee id"); 
ob.emp_id = in.nextInt(); 
System.out.println ("Enter Employee Name"); 
in.nextLine();
ob.emp_name = in.nextLine(); 
System.out.println ("Enter Basic Salary"); 
ob.basic_salary = in.nextDouble(); 
ob.display();
}
}
