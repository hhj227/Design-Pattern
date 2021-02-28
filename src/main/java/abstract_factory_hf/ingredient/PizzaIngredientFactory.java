package abstract_factory_hf.ingredient;

import abstract_factory_hf.ingredient.cheese.Cheese;
import abstract_factory_hf.ingredient.dough.Dough;
import abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import abstract_factory_hf.ingredient.sauce.Sauce;
import abstract_factory_hf.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
}
