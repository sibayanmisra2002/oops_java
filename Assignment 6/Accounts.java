import java.util.*; abstract class Accounts {
double balance;
String accountNumber, accountHoldersName, address; Accounts(double bal, String an, String name, String add) {
 
balance = bal; accountNumber = an; accountHoldersName = name; address = add;
}

abstract void withdrawl(double amt); abstract void deposit(double amt);
void display() { System.out.println(
"Balance of Account No( " + accountNumber + " ) = " + balance
);
}
}

class SavingsAccount extends Accounts { double rateOfInterest;
SavingsAccount(double bal, String an, String name, String add, double rate) { super(bal, an, name, add);
rateOfInterest = rate;
}

public void withdrawl(double amt) { if (amt <= balance) {
System.out.println("Withdrawal Successful"); balance -= amt;
display();
} else {
System.out.println("Requested amount is greater than Balance"); display();
}
}

public void deposit(double amt) { System.out.println("Withdrawal Successful"); balance += amt;
display();
}

void calculateAmount() {
double amt = (balance + balance * rateOfInterest / 100.0); System.out.println("Amount = " + amt);
balance = amt; System.out.println("Balance Updated"); display();
}
}

public class program10 {

public static void main(String args[]) { Scanner in = new Scanner(System.in); double bal, rate;
String an, name, add; System.out.println("Enter Account Number: "); an = in.next();
in.nextLine();
System.out.println("Enter Account Holder Name: "); name = in.nextLine();
System.out.println("Enter Address: "); add = in.nextLine();
System.out.println("Enter Starting Balance: "); bal = in.nextDouble();
 
System.out.println("Enter Rate Of Interest: "); rate = in.nextDouble();
SavingsAccount ob = new SavingsAccount(bal, an, name, add, rate); System.out.println("Bank Account Successfully Created");
int ch;
w:while (true) { System.out.println(
"\n\n****************************************************"
);
System.out.println("Bank Menu"); System.out.println("1. Withdrawal"); System.out.println("2. Deposit"); System.out.println("3. Calculate Amount"); System.out.println("4. Exit"); System.out.println("Enter your choice: "); ch = in.nextInt();
double amt; switch (ch) {
case 1:
System.out.println("Enter Withdrawal Amount : "); amt = in.nextDouble();
ob.withdrawl(amt); break;
case 2:
System.out.println("Enter Deposit Amount : "); amt = in.nextDouble();
ob.deposit(amt); break;
case 3: ob.calculateAmount(); break;
case 4:
System.out.println("Thank You"); break w;
default:
System.out.println("Invalid Option");
}
}
}
}
