package stacksAndQueues;

import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Abhinav on 12/30/2015.
 */
public class CatsAndDogs {
    LinkedList<Obj> cats;
    LinkedList<Obj> dogs;

    public CatsAndDogs() {
        cats = new LinkedList<Obj>();
        dogs = new LinkedList<Obj>();
    }

    public void enqueueCats(String name) {
        Obj temp = new Obj();
        Date date = new Date();
        temp.name = name;
        temp.time = date;
        cats.add(temp);
        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void enqueueDogs(String name) {
        Obj temp = new Obj();
        Date date = new Date();
        temp.name = name;
        temp.time = date;
        dogs.add(temp);
        try {
            TimeUnit.MICROSECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void dequeueCats(String name) {
        cats.removeFirst();
    }

    public void dequeueDogs(String name) {
        dogs.removeFirst();
    }

    public void adoptAnimal() {
        if (!cats.isEmpty() && !dogs.isEmpty()) {

            if (cats.getFirst().time.before(dogs.getFirst().time)) {
                System.out.println("you adopted " + cats.getFirst().name);
                cats.removeFirst();
            } else {
                System.out.println("you adopted " + dogs.getFirst().name);
                dogs.removeFirst();
            }
            return;
        }

        if (cats.isEmpty()) {
            System.out.println("you adopted " + dogs.getFirst().name);
            dogs.removeFirst();
            return;
        }
        if (dogs.isEmpty()) {
            System.out.println("you adopted " + cats.getFirst().name);
            cats.removeFirst();
            return;
        }
    }
    public void adoptDog() {
        System.out.println("you adopted " + dogs.getFirst().name);
        dogs.removeFirst();

    }

    public void adoptCat() {

        System.out.println("you adopted " + cats.getFirst().name);
        cats.removeFirst();

    }

    public void display() {

        System.out.println(cats.peekFirst().getName());
        System.out.println(dogs.peekFirst().getName());

    }
}