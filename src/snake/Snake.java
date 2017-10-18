package snake;

import java.awt.*;

public class Snake
{
    public Snake()
    {
        locations = new Point[25 * 25];
        reset();
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int newLength){
        length = newLength;
    }

    private Point[] locations;

    public Point[] getLocations() {
        return locations;
    }

    public void setLocations(Point[] newLocations){
        locations = newLocations;
        setLength(newLocations.length);
    }



    public void reset() {
        length = 2;
        locations[0] = new Point(1, 0);
        locations[1] = new Point(0, 0);
    }

    public void move() {
        for (int i = length - 1; i > 0; i--) {
            locations[i].x = locations[i - 1].x;
            locations[i].y = locations[i - 1].y;
        }

    }
    public void turnUp() {
        move();
        locations[0].y--;
    }

    public void turnDown() {
        move();
        locations[0].y++;
    }

    public void turnLeft() {
        move();
        locations[0].x--;
    }

    public void turnRight() {
        move();
        locations[0].x++;
    }

    public void addLength() {
        length++;
        locations[length - 1] = new Point();
        locations[length - 1].x = locations[length - 2].x;
        locations[length - 1].y = locations[length - 2].y;
    }


}
