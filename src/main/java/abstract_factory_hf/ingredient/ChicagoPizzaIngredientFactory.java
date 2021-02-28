package abstract_factory_hf.ingredient;

import abstract_factory_hf.ingredient.cheese.Cheese;
import abstract_factory_hf.ingredient.cheese.MozzarellaCheese;
import abstract_factory_hf.ingredient.dough.Dough;
import abstract_factory_hf.ingredient.dough.ThickCrustDough;
import abstract_factory_hf.ingredient.pepperoni.Pepperoni;
import abstract_factory_hf.ingredient.pepperoni.SlicedPepperoni;
import abstract_factory_hf.ingredient.sauce.PlumTomatoSauce;
import abstract_factory_hf.ingredient.sauce.Sauce;
import abstract_factory_hf.ingredient.veggie.BlackOlives;
import abstract_factory_hf.ingredient.veggie.Spinach;
import abstract_factory_hf.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
