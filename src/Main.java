
import java.util.Iterator;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
	   LinkedList <String> turtles = new LinkedList<>();

       turtles.add("Splinter");
       turtles.add("Michaelangelo");
       turtles.add("Donetello");
       turtles.add("Raphael");
       turtles.add("Leonardo");

        System.out.println("Here are the Turtles: "+ turtles);
        System.out.println("The first is: " + turtles.getFirst());
        System.out.println("The last is: " + turtles.getLast());

        // remove Splinter who is not a turtle
        turtles.removeFirst();
        System.out.println("Here are the real Turtles: "+ turtles);

        // add Splinter back
        turtles.addFirst("Splinter");
        System.out.println("Here is the entire team: "+ turtles);

        // basic iteration with for each this is read only so you can't change list
        for(String elem:turtles)
        {
            System.out.println(elem);
        }

        // use an iterator
        Iterator turtleator = turtles.iterator();

        while(turtleator.hasNext())
        {
            System.out.println(turtleator.next());
        }
        turtles.set(0,"Tom");

        System.out.println(turtles);
    }
}
