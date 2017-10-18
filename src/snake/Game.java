package snake;

import javax.swing.*;
import java.io.*;

public class Game extends JFrame{

    public Game(){
        setTitle("snake.Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Config config = new Config();
        setSize(config.getWindowWidth(),config.getWindowHeight());
        setLocation(100,100);
        GameField firstGF = new GameField(config);
        add(firstGF); // add on the main window
        setVisible(true);
    }

    public static void main(String[] args) {
        Game mw = new Game();
    }

    public static void serialize(GameField gf, String levelName) throws IOException {
        FileOutputStream fos = new FileOutputStream(levelName +".out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(gf);  // serializatin
        oos.flush();
        oos.close();
    }

    public static GameField deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        GameField gf = (GameField) oin.readObject();
        return gf;
    }
}
