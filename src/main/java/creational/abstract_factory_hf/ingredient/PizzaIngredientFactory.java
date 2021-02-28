package creational.abstract_factory_hf.ingredient;

import creational.abstract_factory_hf.ingredient.cheese.Cheese;
import creational.abstract_factory_hf.ingredient.dough.Dough;
import creational.abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import creational.abstract_factory_hf.ingredient.sauce.Sauce;
import creational.abstract_factory_hf.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
}
