class Fraction {

int numerator,denominator; Fraction () {
numerator=0; denominator=1;
}

Fraction (int x, int y) {

numerator=x; denominator=y;
}
 
Fraction(int x) { numerator=x; denominator=1;
}

void display() {
System.out.println ("Fraction = "+(double)(numerator)/denominator);
}
}

class program12
{
public static void main(String[] args) { Fraction f1 = new Fraction(); f1.display();
Fraction f2 = new Fraction(10,12); f2.display();
Fraction f3 = new Fraction(15); f3.display();
}
}

