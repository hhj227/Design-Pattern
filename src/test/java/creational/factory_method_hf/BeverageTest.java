package creational.factory_method_hf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {

    @Test
    void test(){
        Beverage beverage = new Tea();
        beverage.prepareRecipe();
    }
}