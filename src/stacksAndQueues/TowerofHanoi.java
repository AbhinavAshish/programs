package stacksAndQueues;

/**
 * Created by Abhinav on 12/29/2015.
 */
public class TowerofHanoi {
    private Stack fromTower = new Stack(20);
    private Stack toTower = new Stack(20);
    private Stack middleTower = new Stack(20);
    private int size;

    public  void setname(){
        fromTower.name ="Tower 1";
        toTower.name="Tower2";
        middleTower.name="Tower3";
    }
    public TowerofHanoi(int size) {

        for (int i = size - 1; i >= 0; i--) {
            fromTower.push(i + 1);
            //System.out.println(i+1);
        }
        this.size = size;
    }

    public void solution(){
        moveTower(size,fromTower,middleTower,toTower);
    }
    public void moveTower(int size, Stack fromTower, Stack middleTower, Stack toTower) {
        if (size == 1) {
            moveDisk(fromTower, toTower);
        } else {

            moveTower(size - 1, fromTower, toTower, middleTower);
            moveDisk(fromTower, toTower);
            moveTower(size - 1, middleTower, fromTower, toTower);

        }
    }

    public void moveDisk(Stack fromTower, Stack toTower) {
        int t = fromTower.popt();
        toTower.push(t);
        System.out.println("moved " + t +" from tower" +  fromTower.name + "to tower" + toTower.name );
    }

    public void displayFromTower (){
        fromTower.display();
    }
    public void displaytoTower (){
        toTower.display();
    }
    public void displayMiddleTower (){
        middleTower.display();
    }
}
