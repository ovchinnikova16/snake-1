package snake;

import java.awt.*;
import java.util.Random;

public class Food
{
    private Point location;
    public Point getLocation() {
        return location;
    }

    public Food(int width, int height) {
        location = new Point();
        createFood(width, height);
    }

    public void createFood(int width, int height) {
        int X = new Random().nextInt(width);
        int Y = new Random().nextInt(height);
        location = new Point(X, Y);
    }
}