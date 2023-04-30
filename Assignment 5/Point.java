import java.util.*;
class Point {

int x; int y;

Point(){
x = y = 0;
}

Point(int x, int y){ this.x = x; this.y = y;
}

double distance (Point ob){
return(Math.sqrt(Math.pow(this.x-ob.x,2)+Math.pow(this.y-ob.y,2)));
}
}


class Circle extends Point{ double radius;

void calculate_radius()
{
Scanner in = new Scanner(System.in); Point ob = new Point();
System.out.println("Enter a coordinate: "); ob.x=in.nextInt();
ob.y=in.nextInt(); radius=distance(ob);
}
void area() {
System.out.println("Area of Circle: "+Math.PI * radius * radius);
}
}


class program10
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
 
Circle obj = new Circle(); System.out.println("Enter a coordinate: "); obj.x=in.nextInt();
obj.y=in.nextInt(); obj.calculate_radius(); obj.area();
}
}
