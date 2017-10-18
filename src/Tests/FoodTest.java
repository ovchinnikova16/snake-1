package Tests;

import org.junit.Test;
import org.junit.Assert;
import snake.Config;
import snake.Food;

public class FoodTest extends Assert{

    @Test
    public void foodIntoTheField(){
        Config config = new Config();
        Food food = new Food(config.getFieldWidth(), config.getFieldHeight());
        assertTrue(food.getLocation().x >= 0);
        assertTrue(food.getLocation().y >= 0);
        assertTrue(food.getLocation().x < 25);
        assertTrue(food.getLocation().y < 25);
    }

}