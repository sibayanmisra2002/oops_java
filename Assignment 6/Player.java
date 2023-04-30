interface Player
{
abstract void play();
}
class Child implements Player
{
public void play()
{
System.out.println("Child plays with toys");
}
}
class Musician implements Player
{
public void play()
{
System.out.println("Musician plays music");
}
}
class Actor implements Player
{
public void play()
{
System.out.println("Actor plays his/her role");
}
}
public class program9
{
public static void main(String args[])
{
Child ob1 = new Child(); ob1.play();
Musician ob2 = new Musician(); ob2.play();
Actor ob3 = new Actor(); ob3.play();
}
}

