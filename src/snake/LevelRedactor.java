package snake;

import java.awt.*;
import javax.swing.*;
import java.io.Serializable;


public class LevelRedactor extends JPanel implements Serializable{
    private int WIDTH = 25;
    private int HEIGHT = 25;
    private int PIXEL = 25;
    private Image wall;

    public LevelRedactor(Config config){
        WIDTH = config.getFieldWidth();
        HEIGHT = config.getFieldHeight();
        PIXEL = config.getPixelSize();
        setBackground(Color.black);
        loadImages();
        setFocusable(true);
    }

    private void loadImages(){
        ImageIcon f = new ImageIcon("wall.png");
        wall = f.getImage();
    }
}
