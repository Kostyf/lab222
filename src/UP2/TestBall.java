package UP2;

import java.util.Scanner;

public class TestBall {
    public static void main(String args[]) {

        Ball newBall1 = new Ball(10, 15);
        System.out.println("Set first position: " + newBall1.toString());
        newBall1.moved(5, 5);
        System.out.println("Moved: " + newBall1.toString());
        newBall1.moved(45, 28);
        Ball newBall2 = new Ball();
        System.out.println("Set (x,y): ");
        Scanner sc = new Scanner(System.in);
        newBall2.setX(sc.nextDouble());
        newBall2.setY(sc.nextDouble());
        System.out.println("Position: " + newBall2.toString());
        sc.close();
    }
}
