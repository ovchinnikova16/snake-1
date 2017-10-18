package Tests;

import java.awt.*;
import org.junit.Test;
import org.junit.Assert;
import snake.Snake;

public class SnakeTest extends Assert{
    @Test
    public void createSnake() {
        Snake snake = new Snake();
        assertEquals(1, snake.getLocations()[0].x);
        assertEquals(0, snake.getLocations()[0].y);
    }
/*
    @Test
    public void isDead(){
        Snake snake = new Snake();
        Point[] arr = new Point[9];
        arr[0] = new Point(0, 0);
        arr[1] = new Point(1, 0);
        arr[2] = new Point(2, 0);
        arr[3] = new Point(2, 1);
        arr[4] = new Point(2, 2);
        arr[5] = new Point(1, 2);
        arr[6] = new Point(0, 2);
        arr[7] = new Point(0, 1);
        arr[8] = new Point(0, 0);
        snake.setLocations(arr);
        assertEquals(true, isDead());
    }

    @Test
    public void isNotDead(){
        Snake snake = new Snake();
        Point[] arr = new Point[9];
        arr[0] = new Point(0, 0);
        arr[1] = new Point(1, 0);
        arr[2] = new Point(2, 0);
        arr[3] = new Point(2, 1);
        arr[4] = new Point(2, 2);
        arr[5] = new Point(1, 2);
        arr[6] = new Point(0, 2);
        arr[7] = new Point(0, 1);
        arr[8] = new Point(1, 1);
        snake.setLocations(arr);
        assertEquals(false, snake.isDead());
    }

*/
    @Test
    public void tryMoveUp(){
        Snake snake = new Snake();
        Point[] arr = new Point[3];
        arr[0] = new Point(2, 2);
        arr[1] = new Point(2, 3);
        arr[2] = new Point(2, 4);
        snake.setLocations(arr);
        snake.turnUp();
        Point[] newLocs = new Point[3];
        newLocs[0] = new Point(2, 1);
        newLocs[1] = new Point(2, 2);
        newLocs[2] = new Point(2, 3);
        for (int i = snake.getLength() - 1; i >= 0; i--) {
            assertEquals(newLocs[i], snake.getLocations()[i]);
        }
    }

    @Test
    public void tryMoveRight(){
        Snake snake = new Snake();
        Point[] arr = new Point[3];
        arr[0] = new Point(2, 2);
        arr[1] = new Point(2, 3);
        arr[2] = new Point(2, 4);
        snake.setLocations(arr);
        snake.turnRight();
        Point[] newLocs = new Point[3];
        newLocs[0] = new Point(3, 2);
        newLocs[1] = new Point(2, 2);
        newLocs[2] = new Point(2, 3);
        for (int i = snake.getLength() - 1; i >= 0; i--) {
            assertEquals(newLocs[i], snake.getLocations()[i]);
        }
    }


    @Test
    public void tryMoveLeft(){
        Snake snake = new Snake();
        Point[] arr = new Point[3];
        arr[0] = new Point(2, 2);
        arr[1] = new Point(2, 3);
        arr[2] = new Point(2, 4);
        snake.setLocations(arr);
        snake.turnLeft();
        Point[] newLocs = new Point[3];
        newLocs[0] = new Point(1, 2);
        newLocs[1] = new Point(2, 2);
        newLocs[2] = new Point(2, 3);
        for (int i = snake.getLength() - 1; i >= 0; i--) {
            assertEquals(newLocs[i], snake.getLocations()[i]);
        }
    }

    @Test
    public void tryMove() {
        Snake snake = new Snake();
        Point[] arr = new Point[3];
        arr[0] = new Point(2, 2);
        arr[1] = new Point(2, 3);
        arr[2] = new Point(2, 4);
        snake.setLocations(arr);
        snake.move();
        Point[] newLocs = new Point[3];
        newLocs[0] = new Point(2, 2);
        newLocs[1] = new Point(2, 2);
        newLocs[2] = new Point(2, 3);
        for (int i = snake.getLength() - 1; i > 0; i--) {
            assertEquals(newLocs[i], snake.getLocations()[i]);
        }
    }
}