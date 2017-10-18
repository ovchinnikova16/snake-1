package snake;

import java.io.Serializable;

public class Config implements Serializable{
    private int fieldWidth;
    private int fieldHeight;
    private int pixelSize;
    private int windowHeight;
    private int windowWidth;

    public Config(){
        fieldWidth = 30;
        fieldHeight = 25;
        pixelSize = 25;
        windowHeight = fieldHeight * pixelSize + 57;
        windowWidth = fieldWidth * pixelSize + 265;
    }

    public int getFieldWidth(){
        return fieldWidth;
    }

    public int getFieldHeight(){
        return fieldHeight;
    }

    public int getPixelSize(){
        return pixelSize;
    }

    public int getWindowHeight(){
        return windowHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }
}
