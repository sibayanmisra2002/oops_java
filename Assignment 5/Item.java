import java.util.*;

class Item { String code; int price;
}
class program13
{
public static void main(String args[])
{
Item[] I = new Item[5]; int total_cost=0;
Scanner in = new Scanner(System.in); for(int i=0;i<5;i++) {
I[i] = new Item();
System.out.print("Enter code for item"+(i+1)+" : "); I[i].code = in.next();
System.out.print("Enter price for item"+(i+1)+" : "); I[i].price = in.nextInt();

}

System.out.println("Item Code Item Price"); System.out.println("	");
for(int i=0;i<5;i++)
{
System.out.print("\t"+I[i].code); System.out.println("\t\t"+I[i].price); total_cost = total_cost + I[i].price;
}
System.out.print("Total Price = "+total_cost);
}
}
